var iframe;

function hideInjectionBox() {
    // optionally, hide the link box that this link is displayed in
    // if you are using more than one custom links box, this probably won't work
    document
        .querySelector("div.linksModule.sidebarModule")
        .style
        .display = "none";
}

function initHelper() {
    // all modern browsers support postMessage--if you need to support
    // < IE 8, then you'll have to use another method.
    if (window.postMessage) {
        iframe = document.getElementById("0661800000007s9AAA");

        if (iframe) {
            // use the event listener system supported by the current browser
            var eventMethod = window.addEventListener 
                ? "addEventListener" : "attachEvent";
            var eventer = window[eventMethod];
            var messageEvent = eventMethod == "attachEvent" 
                ? "onmessage" : "message";

            eventer(messageEvent, ReceiveMessage, false);
        }
    }
}

function ReceiveMessage(event) {
    // use the origin method supported by the current browser
    var originMethod = event.origin ? "origin" : "domain";

    // if your browser uses the domain method (instead of origin)
    // then you won't want to include the http://
    if (event[originMethod] != "http://domain-of-my-iframe.example.com) {
        // bad domain
        return;
    }

    iframe.style.height = event.data;
}

window.onload = function() {
    hideInjectionBox();
    initHelper();
}