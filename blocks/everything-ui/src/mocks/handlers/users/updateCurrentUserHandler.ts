import { http, passthrough } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/me
 * Response type: User
 */
export const Users_updateCurrentUserHandler = http.post(
    '*/api/rest/users/users/me',

    () => {
        // TODO: Return a response of type User
        return passthrough();
    }
);
