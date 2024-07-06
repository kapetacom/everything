import { http, passthrough } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/recover-password
 * Response type: Token
 */
export const Users_recoverPasswordHandler = http.post(
    '*/api/rest/users/users/recover-password',

    () => {
        // TODO: Return a response of type Token
        return passthrough();
    }
);
