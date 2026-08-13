            package p000;

            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            
            public class Oliilol extends Iii01o00i {
                public Dialog I01I0Iioooo0;
                public DialogInterface.OnCancelListener I01I1Oo0oll;
                public AlertDialog I01II10;

                @Override
                public final Dialog I00IoO0() {
/* 1 */             Dialog dialog = this.I01I0Iioooo0;
/* 3 */             if (dialog != null) {
/* 55 */                return dialog;
                    }
/* 6 */             this.I011Ol0 = false;
/* 8 */             AlertDialog alertDialog = this.I01II10;
/* 10 */            if (alertDialog != null) {
/* 55 */                return alertDialog;
                    }
/* 14 */            Context contextI000OiO = I000OiO();
/* 18 */            lII0I0I000I.I000II(contextI000OiO);
/* 24 */            AlertDialog alertDialogCreate = new AlertDialog.Builder(contextI000OiO).create();
/* 28 */            this.I01II10 = alertDialogCreate;
/* 55 */            return alertDialogCreate;
                }

                @Override
                public final void onCancel(DialogInterface dialogInterface) {
/* 1 */             DialogInterface.OnCancelListener onCancelListener = this.I01I1Oo0oll;
/* 3 */             if (onCancelListener != null) {
/* 5 */                 onCancelListener.onCancel(dialogInterface);
                    }
                }
            }
