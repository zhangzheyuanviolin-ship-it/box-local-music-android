            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import androidx.work.impl.model.WorkSpec;
            import com.google.firebase.messaging.FirebaseMessaging;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Set;
            import java.util.UUID;
            
/* 42 */    public final class I1ii1l10IO {
                public boolean I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public I1ii1l10IO(Class cls) {
/* 8 */             this.I00000oOI = UUID.randomUUID();
/* 27 */            this.I0000Il00O = new WorkSpec(((UUID) this.I00000oOI).toString(), cls.getName());
/* 41 */            this.I0000O = Oio0lI.I0000O(cls.getName());
                }

                public OIi0i0 I00000oIO() {
/* 4 */             if (this.I00000oIO && ((WorkSpec) this.I0000Il00O).constraints.I0000O) {
/* 19 */                I000II.I000iOII("Cannot set backoff criteria on an idle mode job");
/* 3 */                 return null;
                    }
/* 27 */            UUID uuid = (UUID) this.I00000oOI;
/* 31 */            WorkSpec workSpec = (WorkSpec) this.I0000Il00O;
/* 37 */            OIi0i0 oIi0i0 = new OIi0i0(uuid, workSpec, (Set) this.I0000O);
/* 40 */            IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 65 */            boolean z = iOo0o10i1IO.I00000oOI() || iOo0o10i1IO.I0000oI00 || iOo0o10i1IO.I0000Il00O || iOo0o10i1IO.I0000O;
/* 68 */            WorkSpec workSpec2 = (WorkSpec) this.I0000Il00O;
/* 72 */            if (workSpec2.expedited) {
/* 74 */                if (z) {
/* 93 */                    I000II.I000iOII("Expedited jobs only support network and storage constraints");
/* 3 */                     return null;
                        }
/* 82 */                if (workSpec2.initialDelay > 0) {
/* 87 */                    I000II.I000iOII("Expedited jobs cannot be delayed");
/* 3 */                     return null;
                        }
                    }
/* 97 */            String traceTag = workSpec2.getTraceTag();
/* 103 */           if (traceTag == null) {
/* 107 */               WorkSpec workSpec3 = (WorkSpec) this.I0000Il00O;
/* 118 */               List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(workSpec3.workerClassName, new String[]{"."}, 6);
/* 139 */               String strI00OIl = listI00IoIO0lI.size() == 1 ? (String) listI00IoIO0lI.get(0) : (String) IOOi0Ool1i.I00Io1o110i(listI00IoIO0lI);
/* 145 */               if (strI00OIl.length() > 127) {
/* 148 */                   strI00OIl = OlOoOIi0o.I00OIl(127, strI00OIl);
                        }
/* 152 */               workSpec3.setTraceTag(strI00OIl);
                    } else if (traceTag.length() > 127) {
/* 170 */               ((WorkSpec) this.I0000Il00O).setTraceTag(OlOoOIi0o.I00OIl(127, traceTag));
                    }
/* 173 */           UUID uuidRandomUUID = UUID.randomUUID();
/* 177 */           this.I00000oOI = uuidRandomUUID;
/* 192 */           this.I0000Il00O = new WorkSpec(uuidRandomUUID.toString(), (WorkSpec) this.I0000Il00O);
/* 245 */           return oIi0i0;
                }

                public void I00000oOI(boolean z) {
/* 3 */             IiiI0l01O iiiI0l01O = (IiiI0l01O) this.I0000O;
                    synchronized (iiiI0l01O) {
                        try {
/* 8 */                     if (this.I00000oIO) {
/* 40 */                        throw new IllegalStateException("editor is closed");
                            }
/* 20 */                    if (O0000Ioio00.I0000O(((Iii1lol) this.I00000oOI).I000II, this)) {
/* 22 */                        iiiI0l01O.I00000oIO(this, z);
                            }
/* 29 */                    this.I00000oIO = true;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public OO0IIO1Il I0000Il00O(int i) {
                    OO0IIO1Il oO0IIO1Il;
/* 3 */             IiiI0l01O iiiI0l01O = (IiiI0l01O) this.I0000O;
                    synchronized (iiiI0l01O) {
/* 8 */                 if (this.I00000oIO) {
/* 58 */                    throw new IllegalStateException("editor is closed");
                        }
/* 15 */                ((boolean[]) this.I0000Il00O)[i] = true;
/* 23 */                Object obj = ((Iii1lol) this.I00000oOI).I0000O.get(i);
/* 27 */                Iii1ooOoII iii1ooOoII = iiiI0l01O.I00o0l1o1o0;
/* 30 */                OO0IIO1Il oO0IIO1Il2 = (OO0IIO1Il) obj;
/* 36 */                if (!iii1ooOoII.I000l1(oO0IIO1Il2)) {
/* 42 */                    I000O01llI0.I00000oIO(iii1ooOoII.I00IOO(oO0IIO1Il2));
                        }
/* 45 */                oO0IIO1Il = (OO0IIO1Il) obj;
                    }
/* 48 */            return oO0IIO1Il;
                }

                public synchronized void I0000O() {
                    try {
/* 4 */                 if (this.I00000oIO) {
/* 7 */                     return;
                        }
/* 8 */                 Boolean boolI0001Ioi1lo = I0001Ioi1lo();
/* 12 */                this.I0000Il00O = boolI0001Ioi1lo;
/* 14 */                if (boolI0001Ioi1lo == null) {
/* 20 */                    IioIoO10iOiI iioIoO10iOiI = new IioIoO10iOiI(15);
/* 23 */                    VarHandle.storeStoreFence();
/* 30 */                    Il10OII il10OII = (Il10OII) ((OliIolIIi) this.I00000oOI);
/* 34 */                    il10OII.I00000oIO(il10OII.I0000Il00O, iioIoO10iOiI);
                        }
/* 41 */                this.I00000oIO = true;
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
                }

                public synchronized boolean I0000oI00() {
                    boolean z;
                    boolean zBooleanValue;
                    try {
/* 2 */                 I0000O();
/* 7 */                 Boolean bool = (Boolean) this.I0000Il00O;
/* 9 */                 if (bool != null) {
/* 11 */                    zBooleanValue = bool.booleanValue();
                        } else {
/* 22 */                    IlIoliIO ilIoliIO = ((FirebaseMessaging) this.I0000O).I00000oIO;
/* 24 */                    ilIoliIO.I00000oIO();
/* 33 */                    Ii11I1l ii11I1l = (Ii11I1l) ilIoliIO.I000II.get();
                            synchronized (ii11I1l) {
/* 36 */                        z = ii11I1l.I00000oIO;
                            }
/* 39 */                    zBooleanValue = z;
                        }
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
/* 41 */            return zBooleanValue;
                }

                public Boolean I0001Ioi1lo() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 7 */             IlIoliIO ilIoliIO = ((FirebaseMessaging) this.I0000O).I00000oIO;
/* 9 */             ilIoliIO.I00000oIO();
/* 12 */            Context context = ilIoliIO.I00000oIO;
/* 17 */            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
/* 27 */            if (sharedPreferences.contains("auto_init")) {
/* 33 */                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
                    }
                    try {
/* 38 */                PackageManager packageManager = context.getPackageManager();
/* 42 */                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Barcode.FORMAT_ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
/* 77 */                    return null;
                        }
/* 72 */                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    } catch (PackageManager.NameNotFoundException unused) {
/* 77 */                return null;
                    }
                }

                public String I000II() {
/* 3 */             if (!this.I00000oIO) {
/* 6 */                 this.I00000oIO = true;
/* 10 */                l0Oi0o l0oi0o = (l0Oi0o) this.I0000O;
/* 25 */                this.I0000Il00O = l0oi0o.I010ioo().getString((String) this.I00000oOI, null);
                    }
/* 29 */            return (String) this.I0000Il00O;
                }

                public void I000O01llI0(String str) {
/* 9 */             SharedPreferences.Editor editorEdit = ((l0Oi0o) this.I0000O).I010ioo().edit();
/* 17 */            editorEdit.putString((String) this.I00000oOI, str);
/* 20 */            editorEdit.apply();
/* 23 */            this.I0000Il00O = str;
                }

/* 43 */        public I1ii1l10IO(l0Oi0o l0oi0o, String str) {
                    this.I0000O = l0oi0o;
/* 45 */            lII0I0I000I.I0000O(str);
                    this.I00000oOI = str;
                }

/* 45 */        public I1ii1l10IO(IiiI0l01O iiiI0l01O, Iii1lol iii1lol) {
                    this.I0000O = iiiI0l01O;
                    this.I00000oOI = iii1lol;
/* 47 */            this.I0000Il00O = new boolean[2];
                }
            }
