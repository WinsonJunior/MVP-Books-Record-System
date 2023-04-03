import React, {useState, useEffect} from 'react'
import "./country.css"

const Country = () => {
    const [countryValue, setCountryValue] = useState("SG");
    
    
    return (
        <button 
            onClick= {onchange()}
            className="country__box">
            <text className="country__box-text">Get country: {countryValue}</text>
        </button>
    )
}

export default Country