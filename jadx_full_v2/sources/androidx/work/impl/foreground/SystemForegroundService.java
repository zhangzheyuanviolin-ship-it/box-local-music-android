            package androidx.work.impl.foreground;

            import android.app.NotificationManager;
            import android.app.Service;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Build;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Looper;
            import android.text.TextUtils;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.UUID;
            import p000.I01O1lIi;
            import p000.I01ii1IIl;
            import p000.IIi0oIl;
            import p000.IlloOIoilIl;
            import p000.IoIlOo1o0IIl;
            import p000.O0oOOiI0;
            import p000.O0oiOi;
            import p000.O0oiiOll0O1;
            import p000.O1oO0lOoI1;
            import p000.OilOol;
            import p000.OillOo0;
            import p000.OlIOOOoi0IlI;
            import p000.OllOO1l1;
            import p000.OloIli;
            import p000.i01IlOO;
            import p000.l1l1IO0Ii;
            
/* 14 */    public class SystemForegroundService extends Service implements O0oiOi {
                public static final String I00ilI0I1 = IIi0oIl.I000OiO("SystemFgService");
                public final IoIlOo1o0IIl I00iOIl;
                public boolean I00iiI;
                public OllOO1l1 I00iiO;
                public NotificationManager I00iio;

                public SystemForegroundService() {
/* 9 */             IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(25, false);
/* 18 */            ioIlOo1o0IIl.I00iiI = new O0oiiOll0O1(this, true);
/* 29 */            ioIlOo1o0IIl.I00iiO = new Handler(Looper.getMainLooper());
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            this.I00iOIl = ioIlOo1o0IIl;
                }

                public final void I00000oIO() {
/* 13 */            this.I00iio = (NotificationManager) getApplicationContext().getSystemService("notification");
/* 17 */            Context applicationContext = getApplicationContext();
/* 21 */            OllOO1l1 ollOO1l1 = new OllOO1l1();
/* 29 */            ollOO1l1.I00iiO = new Object();
/* 31 */            i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(applicationContext);
/* 35 */            ollOO1l1.I00iOIl = i01ilooI00000oOI;
/* 39 */            ollOO1l1.I00iiI = i01ilooI00000oOI.I0000O;
/* 42 */            ollOO1l1.I00iio = null;
/* 49 */            ollOO1l1.I00ilI0I1 = new LinkedHashMap();
/* 56 */            ollOO1l1.I00io1l = new HashMap();
/* 63 */            ollOO1l1.I00ilO0 = new HashMap();
/* 72 */            ollOO1l1.I00ioIO = new OlIOOOoi0IlI(i01ilooI00000oOI.I000iOII);
/* 76 */            i01ilooI00000oOI.I0001Ioi1lo.I00000oIO(ollOO1l1);
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            this.I00iiO = ollOO1l1;
/* 86 */            if (ollOO1l1.I00l0I0l0lO1 != null) {
/* 96 */                IIi0oIl.I000II().I0000oI00(OllOO1l1.I00l0OO0IO, "A callback already exists.");
                    } else {
/* 100 */               ollOO1l1.I00l0I0l0lO1 = this;
                    }
                }

                public final void I0000Il00O() {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iOIl;
/* 3 */             ioIlOo1o0IIl.getClass();
/* 8 */             ioIlOo1o0IIl.I00IOO(O0oOOiI0.ON_CREATE);
/* 11 */            super.onCreate();
                }

                public final void I0000O() {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iOIl;
/* 3 */             ioIlOo1o0IIl.getClass();
/* 8 */             ioIlOo1o0IIl.I00IOO(O0oOOiI0.ON_STOP);
/* 13 */            ioIlOo1o0IIl.I00IOO(O0oOOiI0.ON_DESTROY);
/* 16 */            super.onDestroy();
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 5 */             return (O0oiiOll0O1) this.I00iOIl.I00iiI;
                }

                @Override
                public final IBinder onBind(Intent intent) {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iOIl;
/* 3 */             ioIlOo1o0IIl.getClass();
/* 8 */             ioIlOo1o0IIl.I00IOO(O0oOOiI0.ON_START);
/* 11 */            return null;
                }

                @Override
                public final void onCreate() {
/* 1 */             I0000Il00O();
/* 4 */             I00000oIO();
                }

                @Override
                public final void onDestroy() {
/* 1 */             I0000O();
/* 6 */             this.I00iiO.I0000oI00();
                }

                @Override
                public final void onStart(Intent intent, int i) {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iOIl;
/* 3 */             ioIlOo1o0IIl.getClass();
/* 8 */             ioIlOo1o0IIl.I00IOO(O0oOOiI0.ON_START);
/* 11 */            super.onStart(intent, i);
                }

                @Override
                public final int onStartCommand(Intent intent, int i, int i2) {
/* 1 */             super.onStartCommand(intent, i, i2);
/* 6 */             if (this.I00iiI) {
/* 16 */                IIi0oIl.I000II().I000OOo1O(I00ilI0I1, "Re-initializing SystemForegroundService after a request to shut-down.");
/* 21 */                this.I00iiO.I0000oI00();
/* 24 */                I00000oIO();
/* 28 */                this.I00iiI = false;
                    }
/* 30 */            int i3 = 3;
/* 31 */            if (intent != null) {
/* 33 */                OllOO1l1 ollOO1l1 = this.I00iiO;
/* 35 */                ollOO1l1.getClass();
/* 38 */                String str = OllOO1l1.I00l0OO0IO;
/* 40 */                String action = intent.getAction();
/* 52 */                if ("ACTION_START_FOREGROUND".equals(action)) {
/* 72 */                    IIi0oIl.I000II().I000OOo1O(str, "Started foreground service " + intent);
/* 75 */                    String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
/* 79 */                    OloIli oloIli = ollOO1l1.I00iiI;
/* 83 */                    IlloOIoilIl illoOIoilIl = new IlloOIoilIl(i3);
/* 86 */                    illoOIoilIl.I00iiO = ollOO1l1;
/* 88 */                    illoOIoilIl.I00iiI = stringExtra;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    oloIli.I0000O(illoOIoilIl);
/* 96 */                    ollOO1l1.I0000O(intent);
                        } else if ("ACTION_NOTIFY".equals(action)) {
/* 109 */                   ollOO1l1.I0000O(intent);
                        } else if ("ACTION_CANCEL_WORK".equals(action)) {
/* 140 */                   IIi0oIl.I000II().I000OOo1O(str, "Stopping foreground work for " + intent);
/* 143 */                   String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
/* 147 */                   if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
/* 155 */                       i01IlOO i01iloo = ollOO1l1.I00iOIl;
/* 157 */                       UUID uuidFromString = UUID.fromString(stringExtra2);
/* 161 */                       i01iloo.getClass();
/* 166 */                       O1oO0lOoI1 o1oO0lOoI1 = i01iloo.I00000oOI.I000oI1ioi;
/* 174 */                       OilOol oilOol = (OilOol) ((OillOo0) i01iloo.I0000O).I00iiI;
/* 180 */                       I01ii1IIl i01ii1IIl = new I01ii1IIl(28);
/* 183 */                       i01ii1IIl.I00iiI = i01iloo;
/* 185 */                       i01ii1IIl.I00iiO = uuidFromString;
/* 187 */                       VarHandle.storeStoreFence();
/* 192 */                       l1l1IO0Ii.I00000oIO(o1oO0lOoI1, "CancelWorkById", oilOol, i01ii1IIl);
                            }
                        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
/* 210 */                   IIi0oIl.I000II().I000OOo1O(str, "Stopping foreground service");
/* 213 */                   SystemForegroundService systemForegroundService = ollOO1l1.I00l0I0l0lO1;
/* 215 */                   if (systemForegroundService != null) {
/* 218 */                       systemForegroundService.I00iiI = true;
/* 224 */                       IIi0oIl.I000II().getClass();
/* 227 */                       systemForegroundService.stopForeground(true);
/* 230 */                       systemForegroundService.stopSelf(i2);
                            }
                        }
                    }
/* 30 */            return 3;
                }

                @Override
                public final void onTimeout(int i) {
/* 5 */             if (Build.VERSION.SDK_INT >= 35) {
/* 7 */                 return;
                    }
/* 12 */            this.I00iiO.I0001Ioi1lo(i, Barcode.FORMAT_PDF417);
                }

/* 15 */        public final void onTimeout(int i, int i2) {
/* 16 */            this.I00iiO.I0001Ioi1lo(i, i2);
                }
            }
