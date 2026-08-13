            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.IntentFilter;
            import android.content.pm.PackageManager;
            import android.os.Trace;
            import android.util.Base64;
            import android.util.Log;
            import com.google.firebase.FirebaseCommonRegistrar;
            import com.google.firebase.components.ComponentDiscoveryService;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import com.google.firebase.provider.FirebaseInitProvider;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IlIoliIO {
                public static final Object I000OiO = new Object();
                public static final I1Io0i0II I000iOII = new I1Io0i0II(0);
                public final Context I00000oIO;
                public final String I00000oOI;
                public final IlO0oiiii0IO I0000Il00O;
                public final IOiOol0 I0000O;
                public final AtomicBoolean I0000oI00;
                public final AtomicBoolean I0001Ioi1lo;
                public final O0ioIo1O0lO I000II;
                public final OOiO0Il I000O01llI0;
                public final CopyOnWriteArrayList I000OOo1O;

                public IlIoliIO(Context context, String str, IlO0oiiii0IO ilO0oiiii0IO) throws PackageManager.NameNotFoundException {
/* 7 */             AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 10 */            this.I0000oI00 = atomicBoolean;
/* 17 */            this.I0001Ioi1lo = new AtomicBoolean();
/* 21 */            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
/* 24 */            this.I000OOo1O = copyOnWriteArrayList;
/* 28 */            new CopyOnWriteArrayList();
/* 31 */            this.I00000oIO = context;
/* 33 */            lII0I0I000I.I0000O(str);
/* 36 */            this.I00000oOI = str;
/* 38 */            this.I0000Il00O = ilO0oiiii0IO;
/* 40 */            I1lIll0iI01i i1lIll0iI01i = FirebaseInitProvider.I00iOIl;
/* 44 */            Trace.beginSection("Firebase");
/* 49 */            Trace.beginSection("ComponentDiscovery");
/* 56 */            int i = 7;
/* 57 */            O1OIll00i o1OIll00i = new O1OIll00i(i);
/* 62 */            o1OIll00i.I00iiI = ComponentDiscoveryService.class;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            IoloOio0I ioloOio0I = new IoloOio0I(i);
/* 70 */            ioloOio0I.I00iiI = context;
/* 72 */            ioloOio0I.I00iiO = o1OIll00i;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            ArrayList arrayListI001IIilI0O = ioloOio0I.I001IIilI0O();
/* 81 */            Trace.endSection();
/* 86 */            Trace.beginSection("Runtime");
/* 91 */            OillOo0 oillOo0I000l1 = IOiOol0.I000l1(Ooi1oi1ii.I00iOIl);
/* 97 */            ArrayList arrayList = (ArrayList) oillOo0I000l1.I00iiO;
/* 99 */            arrayList.addAll(arrayListI001IIilI0O);
/* 104 */           FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
/* 109 */           int i2 = 1;
/* 110 */           IOiOi00Io1 iOiOi00Io1 = new IOiOi00Io1(i2);
/* 113 */           iOiOi00Io1.I00000oOI = firebaseCommonRegistrar;
/* 115 */           VarHandle.storeStoreFence();
/* 118 */           arrayList.add(iOiOi00Io1);
/* 123 */           ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
/* 128 */           IOiOi00Io1 iOiOi00Io12 = new IOiOi00Io1(i2);
/* 131 */           iOiOi00Io12.I00000oOI = executorsRegistrar;
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           arrayList.add(iOiOi00Io12);
/* 147 */           oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(context, Context.class, new Class[0]));
/* 158 */           oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(this, IlIoliIO.class, new Class[0]));
/* 169 */           oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(ilO0oiiii0IO, IlO0oiiii0IO.class, new Class[0]));
/* 179 */           oillOo0I000l1.I00ilI0I1 = new IIIOlol(10);
/* 185 */           if (li0O01lloo01.I00000oIO(context) && FirebaseInitProvider.I00iiI.get()) {
/* 203 */               oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(i1lIll0iI01i, I1lIll0iI01i.class, new Class[0]));
                    }
/* 206 */           IOiOol0 iOiOol0I000II = oillOo0I000l1.I000II();
/* 210 */           this.I0000O = iOiOol0I000II;
/* 212 */           Trace.endSection();
/* 220 */           IOiOoii0lI0I iOiOoii0lI0I = new IOiOoii0lI0I(2);
/* 223 */           iOiOoii0lI0I.I00000oOI = this;
/* 225 */           iOiOoii0lI0I.I0000Il00O = context;
/* 227 */           VarHandle.storeStoreFence();
/* 233 */           this.I000II = new O0ioIo1O0lO(iOiOoii0lI0I);
/* 241 */           this.I000O01llI0 = iOiOol0I000II.I0001Ioi1lo(Ii1oil.class);
/* 245 */           IlIoOiIl1l0 ilIoOiIl1l0 = new IlIoOiIl1l0();
/* 248 */           ilIoOiIl1l0.I00000oIO = this;
/* 250 */           VarHandle.storeStoreFence();
/* 253 */           I00000oIO();
/* 260 */           if (atomicBoolean.get()) {
/* 266 */               I1o00Ol1.I00ilI0I1.I00iOIl.get();
                    }
/* 269 */           copyOnWriteArrayList.add(ilIoOiIl1l0);
/* 272 */           Trace.endSection();
                }

                public static IlIoliIO I00000oOI() {
                    IlIoliIO ilIoliIO;
                    synchronized (I000OiO) {
                        try {
/* 14 */                    ilIoliIO = (IlIoliIO) I000iOII.get("[DEFAULT]");
/* 16 */                    if (ilIoliIO == null) {
/* 37 */                        StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
/* 40 */                        String processName = lIIiIil0.I00000oIO;
/* 42 */                        if (processName == null) {
/* 44 */                            processName = Application.getProcessName();
/* 48 */                            lIIiIil0.I00000oIO = processName;
                                }
/* 50 */                        sb.append(processName);
/* 55 */                        sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
/* 65 */                        throw new IllegalStateException(sb.toString());
                            }
/* 26 */                    ((Ii1oil) ilIoliIO.I000O01llI0.get()).I00000oOI();
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
/* 30 */            return ilIoliIO;
                }

                public static IlIoliIO I0000oI00(Context context) {
                    synchronized (I000OiO) {
                        try {
/* 12 */                    if (I000iOII.containsKey("[DEFAULT]")) {
/* 14 */                        return I00000oOI();
                            }
/* 22 */                    IlO0oiiii0IO ilO0oiiii0IOI00000oIO = IlO0oiiii0IO.I00000oIO(context);
/* 26 */                    if (ilO0oiiii0IOI00000oIO == null) {
/* 32 */                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
/* 35 */                        return null;
                            }
/* 38 */                    return I0001Ioi1lo(context, ilO0oiiii0IOI00000oIO);
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }

                public static IlIoliIO I0001Ioi1lo(Context context, IlO0oiiii0IO ilO0oiiii0IO) {
                    IlIoliIO ilIoliIO;
/* 3 */             AtomicReference atomicReference = IlIoi1iOOlOI.I00000oIO;
/* 11 */            if (context.getApplicationContext() instanceof Application) {
/* 18 */                Application application = (Application) context.getApplicationContext();
/* 20 */                AtomicReference atomicReference2 = IlIoi1iOOlOI.I00000oIO;
/* 26 */                if (atomicReference2.get() == null) {
/* 30 */                    IlIoi1iOOlOI ilIoi1iOOlOI = new IlIoi1iOOlOI();
/* 38 */                    if (atomicReference2.compareAndSet(null, ilIoi1iOOlOI)) {
/* 40 */                        I1o00Ol1.I00000oIO(application);
/* 43 */                        I1o00Ol1 i1o00Ol1 = I1o00Ol1.I00ilI0I1;
/* 45 */                        i1o00Ol1.getClass();
                                synchronized (i1o00Ol1) {
/* 51 */                            i1o00Ol1.I00iiO.add(ilIoi1iOOlOI);
                                }
                            }
                        }
                    }
/* 63 */            if (context.getApplicationContext() != null) {
/* 66 */                context = context.getApplicationContext();
                    }
                    synchronized (I000OiO) {
/* 73 */                I1Io0i0II i1Io0i0II = I000iOII;
/* 83 */                lII0I0I000I.I000OOo1O("FirebaseApp name [DEFAULT] already exists!", !i1Io0i0II.containsKey("[DEFAULT]"));
/* 88 */                lII0I0I000I.I000O01llI0("Application context cannot be null.", context);
/* 93 */                ilIoliIO = new IlIoliIO(context, "[DEFAULT]", ilO0oiiii0IO);
/* 96 */                i1Io0i0II.put("[DEFAULT]", ilIoliIO);
                    }
/* 100 */           ilIoliIO.I0000O();
/* 103 */           return ilIoliIO;
                }

                public final void I00000oIO() {
/* 11 */            lII0I0I000I.I000OOo1O("FirebaseApp was deleted", !this.I0001Ioi1lo.get());
                }

                public final String I0000Il00O() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             I00000oIO();
/* 15 */            byte[] bytes = this.I00000oOI.getBytes(Charset.defaultCharset());
/* 30 */            sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
/* 35 */            sb.append("+");
/* 38 */            I00000oIO();
/* 49 */            byte[] bytes2 = this.I0000Il00O.I00000oOI.getBytes(Charset.defaultCharset());
/* 60 */            sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
/* 63 */            return sb.toString();
                }

                public final void I0000O() {
/* 1 */             Context context = this.I00000oIO;
/* 3 */             boolean zI00000oIO = li0O01lloo01.I00000oIO(context);
/* 7 */             String str = this.I00000oOI;
/* 11 */            if (zI00000oIO) {
/* 73 */                StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
/* 76 */                I00000oIO();
/* 79 */                sb.append(str);
/* 86 */                Log.i("FirebaseApp", sb.toString());
/* 89 */                I00000oIO();
/* 100 */               this.I0000O.I001IIilI0O("[DEFAULT]".equals(str));
/* 111 */               ((Ii1oil) this.I000O01llI0.get()).I00000oOI();
/* 541 */               return;
                    }
/* 17 */            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
/* 20 */            I00000oIO();
/* 23 */            sb2.append(str);
/* 30 */            Log.i("FirebaseApp", sb2.toString());
/* 33 */            AtomicReference atomicReference = IlIoioO00loO.I00000oOI;
/* 39 */            if (atomicReference.get() == null) {
/* 43 */                IlIoioO00loO ilIoioO00loO = new IlIoioO00loO();
/* 46 */                ilIoioO00loO.I00000oIO = context;
/* 48 */                VarHandle.storeStoreFence();
/* 56 */                if (atomicReference.compareAndSet(null, ilIoioO00loO)) {
/* 65 */                    context.registerReceiver(ilIoioO00loO, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IlIoliIO)) {
/* 5 */                 return false;
                    }
/* 7 */             IlIoliIO ilIoliIO = (IlIoliIO) obj;
/* 9 */             ilIoliIO.I00000oIO();
/* 16 */            return this.I00000oOI.equals(ilIoliIO.I00000oOI);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oOI.hashCode();
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 9 */             iol01110I00000oOI.I0000Il00O("name", this.I00000oOI);
/* 16 */            iol01110I00000oOI.I0000Il00O("options", this.I0000Il00O);
/* 19 */            return iol01110I00000oOI.toString();
                }
            }
