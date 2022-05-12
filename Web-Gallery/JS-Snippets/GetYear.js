/*
    @ GetYear v1.0
    DESC: Plants the current year inside "#blz-footer-date".
    (c) MIT Tyler Ruff; Blazed Labs LLC
*/
document.getElementById('blz-footer-date').innerHTML = new Date().getFullYear();