import React from 'react';
import logo from './logo.svg';
import './App.css';
import MyComponent from "./components/MyComponent";

function App() {
    const showComponent = true;
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                {showComponent ? <MyComponent/> : null}
            </header>
        </div>
    );
}

export default App;
