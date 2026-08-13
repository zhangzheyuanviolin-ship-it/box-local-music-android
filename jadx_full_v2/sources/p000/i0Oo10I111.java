            package p000;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.Resources;
            import android.os.Looper;
            import android.os.Message;
            import android.util.Log;
            
            public final class i0Oo10I111 extends O1oo1il01OoO {
                public final Context I00000oOI;
                public final Io0i1l I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0Oo10I111(Io0i1l io0i1l, Context context) {
/* 20 */            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1, false);
/* 1 */             this.I0000Il00O = io0i1l;
/* 23 */            Looper.getMainLooper();
/* 30 */            this.I00000oOI = context.getApplicationContext();
                }

                @Override
                public final void handleMessage(Message message) throws Resources.NotFoundException {
/* 1 */             int i = message.what;
/* 4 */             if (i != 1) {
/* 18 */                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
/* 23 */                sb.append("Don't know how to handle this message: ");
/* 26 */                sb.append(i);
/* 35 */                Log.w("GoogleApiAvailability", sb.toString());
/* 38 */                return;
                    }
/* 39 */            int i2 = Io0iI1l01il.I00000oIO;
/* 41 */            Io0i1l io0i1l = this.I0000Il00O;
/* 43 */            Context context = this.I00000oOI;
/* 45 */            int iI00000oOI = io0i1l.I00000oOI(context, i2);
/* 49 */            int i3 = Io0ii0lOoi.I0000oI00;
/* 51 */            if (iI00000oOI == 1 || iI00000oOI == 2 || iI00000oOI == 3 || iI00000oOI == 9) {
/* 66 */                Intent intentI00000oIO = io0i1l.I00000oIO(iI00000oOI, context, "n");
/* 81 */                io0i1l.I0000O(context, iI00000oOI, intentI00000oIO == null ? null : PendingIntent.getActivity(context, 0, intentI00000oIO, 201326592));
                    }
                }
            }
