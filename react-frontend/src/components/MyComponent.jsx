import React, {useEffect, useState} from "react"
import axios from 'axios'

/**
 * This component should show some information about a Star Wars character.
 * @returns {*}
 * @constructor
 */
const MyComponent = () => {
    const [name, setName] = useState("Luke");
    const CHARACTER_API_URL=`http://localhost:8080/api/v1/sw/character`

    useEffect(() => {
        //Call spring back-end
        setName(axios.get(`$CHARACTER_API_URL}`))
    }, []);

    return <div>
        Name: {name}
    </div>
};

export default MyComponent
