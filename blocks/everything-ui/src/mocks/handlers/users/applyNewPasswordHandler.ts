import { http, HttpResponse } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/recover-password/apply
 * Response type: void
 */
export const Users_applyNewPasswordHandler = http.post(
    '*/api/rest/users/users/recover-password/apply',

    () => {
        return new HttpResponse(null, { status: 200 });
    }
);
