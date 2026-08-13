            package p000;

            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.app.DialogFragment;
            import android.content.DialogInterface;
            import android.os.Bundle;
            
            public class Il0oIo0lo extends DialogFragment {
                public Dialog I00iOIl;
                public DialogInterface.OnCancelListener I00iiI;
                public AlertDialog I00iiO;

                @Override
                public final void onCancel(DialogInterface dialogInterface) {
/* 1 */             DialogInterface.OnCancelListener onCancelListener = this.I00iiI;
/* 3 */             if (onCancelListener != null) {
/* 5 */                 onCancelListener.onCancel(dialogInterface);
                    }
                }

                @Override
                public final Dialog onCreateDialog(Bundle bundle) {
/* 1 */             Dialog dialog = this.I00iOIl;
/* 3 */             if (dialog != null) {
/* 77 */                return dialog;
                    }
/* 6 */             setShowsDialog(false);
/* 9 */             AlertDialog alertDialog = this.I00iiO;
/* 11 */            if (alertDialog != null) {
/* 77 */                return alertDialog;
                    }
/* 15 */            Activity activity = getActivity();
/* 19 */            lII0I0I000I.I000II(activity);
/* 25 */            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
/* 29 */            this.I00iiO = alertDialogCreate;
/* 77 */            return alertDialogCreate;
                }
            }
