import React, {} from 'react'
import "./country.css"

const Country = ({countryCode, onChange}) => {
    
    
    return (
        <button 
            onClick={onChange}
            className="country__box"
            data-testid="action-btn"
            id="action-btn"
            >
                <p className="country__box-text">Get country: {countryCode}</p>
        </button>
    )
}

export default Country