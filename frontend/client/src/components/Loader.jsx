import React from "react";
import "../style/l.css";
function Loader() {
  return (
    <div>
      <div className="loader">
        <div className="panWrapper">
          <div className="pan">
            <div className="food" />
            <div className="panBase" />
            <div className="panHandle" />
          </div>
          <div className="panShadow" />
        </div>
      </div>
    </div>
  );
}

export default Loader;
