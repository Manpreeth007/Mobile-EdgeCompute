
package com.edge.http.servlet;

import java.util.List;

import com.edge.http.Headers;

public interface HttpServletResponse extends ServletResponse {

    String STATUS_OK = "HTTP/1.1 200 OK";
    String STATUS_PARTIAL_CONTENT = "HTTP/1.1 206 Partial Content";
    String STATUS_NOT_FOUND = "HTTP/1.1 404 Not Found";
    String STATUS_SERVICE_UNAVAILABLE = "HTTP/1.1 503 Service Unavailable";
    String HTTP_VERSION_NOT_SUPPORTED = "HTTP/1.1 505 HTTP Version Not Supported";
    String STATUS_METHOD_NOT_ALLOWED = "HTTP/1.1 405 Method Not Allowed";
    String STATUS_INTERNAL_SERVER_ERROR = "HTTP/1.1 500 Internal Server Error";
    String STATUS_ACCESS_DENIED = "HTTP/1.1 403 Forbidden";
    String STATUS_MOVED_PERMANENTLY = "HTTP/1.1 301 Moved Permanently";
    String STATUS_NOT_MODIFIED = "HTTP/1.1 304 Not Modified";
    String STATUS_NOT_IMPLEMENTED = "HTTP/1.1 501 Not Implemented";
    String STATUS_URI_TOO_LONG = "HTTP/1.1 414 URI Too Long";
    String REQUEST_ENTITY_TOO_LARGE = "HTTP/1.1 413 Request Entity Too Large";
    String STATUS_BAD_REQUEST = "HTTP/1.1 400 Bad Request";
    String STATUS_LENGTH_REQUIRED = "HTTP/1.1 411 Length Required";
    String STATUS_RANGE_NOT_SATISFIABLE = "HTTP/1.1 416 Range Not Satisfiable";

    void addCookie(Cookie cookie);

    List<Cookie> getCookies();

    void sendRedirect(String location);

    void setContentType(String contentType);

    String getContentType();

    void setKeepAlive(boolean keepAlive);

    void setContentLength(int length);

    void setContentLength(long length);

    Headers getHeaders();

    void setStatus(String status);

    void setHeader(String name, String value);

    void setIntHeader(String name, int value);
}
