import { http, passthrough } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/authenticate
 * Response type: Token
 */
export const Users_authenticateHandler = http.post(
    '*/api/rest/users/users/authenticate',

    () => {
        // TODO: Return a response of type Token
        return passthrough();
    }
);
