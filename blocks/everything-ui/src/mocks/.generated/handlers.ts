import { sortHandlersByPathSpecificity } from './sortHandlers';
import { Users_registerUserHandler } from '../handlers/users/registerUserHandler';
import { Users_activateUserHandler } from '../handlers/users/activateUserHandler';
import { Users_authenticateHandler } from '../handlers/users/authenticateHandler';
import { Users_recoverPasswordHandler } from '../handlers/users/recoverPasswordHandler';
import { Users_applyNewPasswordHandler } from '../handlers/users/applyNewPasswordHandler';
import { Users_getCurrentUserHandler } from '../handlers/users/getCurrentUserHandler';
import { Users_updateCurrentUserHandler } from '../handlers/users/updateCurrentUserHandler';

export const handlers = sortHandlersByPathSpecificity([
    Users_registerUserHandler,
    Users_activateUserHandler,
    Users_authenticateHandler,
    Users_recoverPasswordHandler,
    Users_applyNewPasswordHandler,
    Users_getCurrentUserHandler,
    Users_updateCurrentUserHandler,
]);
