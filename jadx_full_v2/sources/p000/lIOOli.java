            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.os.Process;
            import android.os.UserManager;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public abstract class lIOOli {
                public static UserManager I00000oIO = null;
                public static volatile boolean I00000oOI = false;

                public static final List I00000oIO(OOOi0i1IOo oOOi0i1IOo, Oi0Oooi oi0Oooi) {
/* 1 */             List arrayList = oOOi0i1IOo.I00lli11;
/* 10 */            if (arrayList.isEmpty()) {
/* 13 */                arrayList = null;
                    }
/* 14 */            if (arrayList == null) {
/* 16 */                List list = oOOi0i1IOo.I00lll10;
/* 28 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 31 */                Iterator it = list.iterator();
/* 39 */                while (it.hasNext()) {
/* 55 */                    arrayList.add(oi0Oooi.I00100l0(((Integer) it.next()).intValue()));
                        }
                    }
/* 89 */            return arrayList;
                }

                public static final List I00000oOI(OOOll1o0 oOOll1o0, Oi0Oooi oi0Oooi) {
/* 1 */             List arrayList = oOOll1o0.I00ll1;
/* 10 */            if (arrayList.isEmpty()) {
/* 13 */                arrayList = null;
                    }
/* 14 */            if (arrayList == null) {
/* 16 */                List list = oOOll1o0.I00lli11;
/* 28 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 31 */                Iterator it = list.iterator();
/* 39 */                while (it.hasNext()) {
/* 55 */                    arrayList.add(oi0Oooi.I00100l0(((Integer) it.next()).intValue()));
                        }
                    }
/* 89 */            return arrayList;
                }

                public static final List I0000Il00O(OOOo0i11Ol oOOo0i11Ol, Oi0Oooi oi0Oooi) {
/* 1 */             List arrayList = oOOo0i11Ol.I00ll1;
/* 10 */            if (arrayList.isEmpty()) {
/* 13 */                arrayList = null;
                    }
/* 14 */            if (arrayList == null) {
/* 16 */                List list = oOOo0i11Ol.I00lli11;
/* 28 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 31 */                Iterator it = list.iterator();
/* 39 */                while (it.hasNext()) {
/* 55 */                    arrayList.add(oi0Oooi.I00100l0(((Integer) it.next()).intValue()));
                        }
                    }
/* 89 */            return arrayList;
                }

                public static final OOi001oo1OOI I0000O(OOi001oo1OOI oOi001oo1OOI, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOi001oo1OOI.I00iiO;
/* 7 */             if ((i & Barcode.FORMAT_QR_CODE) == 256) {
/* 9 */                 return oOi001oo1OOI.I00lli11;
                    }
/* 15 */            if ((i & Barcode.FORMAT_UPC_A) == 512) {
/* 19 */                return oi0Oooi.I00100l0(oOi001oo1OOI.I00lll10);
                    }
/* 24 */            return null;
                }

                public static final OOi001oo1OOI I0000oI00(OOOll1o0 oOOll1o0, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOOll1o0.I00iiO;
/* 7 */             if ((i & 32) == 32) {
/* 9 */                 return oOOll1o0.I00l0OO0IO;
                    }
/* 15 */            if ((i & 64) == 64) {
/* 19 */                return oi0Oooi.I00100l0(oOOll1o0.I00li1OI);
                    }
/* 24 */            return null;
                }

                public static final OOi001oo1OOI I0001Ioi1lo(OOOo0i11Ol oOOo0i11Ol, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOOo0i11Ol.I00iiO;
/* 7 */             if ((i & 32) == 32) {
/* 9 */                 return oOOo0i11Ol.I00l0OO0IO;
                    }
/* 15 */            if ((i & 64) == 64) {
/* 19 */                return oi0Oooi.I00100l0(oOOo0i11Ol.I00li1OI);
                    }
/* 24 */            return null;
                }

                public static final OOi001oo1OOI I000II(OOOll1o0 oOOll1o0, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOOll1o0.I00iiO;
/* 7 */             if ((i & 8) == 8) {
/* 9 */                 return oOOll1o0.I00io1l;
                    }
/* 15 */            if ((i & 16) == 16) {
/* 19 */                return oi0Oooi.I00100l0(oOOll1o0.I00ioIO);
                    }
/* 26 */            I000II.I001IO000("No returnType in ProtoBuf.Function");
/* 29 */            return null;
                }

                public static final OOi001oo1OOI I000O01llI0(OOOo0i11Ol oOOo0i11Ol, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOOo0i11Ol.I00iiO;
/* 7 */             if ((i & 8) == 8) {
/* 9 */                 return oOOo0i11Ol.I00io1l;
                    }
/* 15 */            if ((i & 16) == 16) {
/* 19 */                return oi0Oooi.I00100l0(oOOo0i11Ol.I00ioIO);
                    }
/* 26 */            I000II.I001IO000("No returnType in ProtoBuf.Property");
/* 29 */            return null;
                }

                public static final List I000OOo1O(OOOi0i1IOo oOOi0i1IOo, Oi0Oooi oi0Oooi) {
/* 1 */             List arrayList = oOOi0i1IOo.I00ioIO;
/* 10 */            if (arrayList.isEmpty()) {
/* 13 */                arrayList = null;
                    }
/* 14 */            if (arrayList == null) {
/* 16 */                List list = oOOi0i1IOo.I00l0I0l0lO1;
/* 28 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 31 */                Iterator it = list.iterator();
/* 39 */                while (it.hasNext()) {
/* 55 */                    arrayList.add(oi0Oooi.I00100l0(((Integer) it.next()).intValue()));
                        }
                    }
/* 89 */            return arrayList;
                }

                public static final OOi001oo1OOI I000OiO(OOi0iiO0iOi oOi0iiO0iOi, Oi0Oooi oi0Oooi) {
/* 1 */             int i = oOi0iiO0iOi.I00iiO;
/* 6 */             if ((i & 4) == 4) {
/* 8 */                 return oOi0iiO0iOi.I00ilO0;
                    }
/* 14 */            if ((i & 8) == 8) {
/* 18 */                return oi0Oooi.I00100l0(oOi0iiO0iOi.I00io1l);
                    }
/* 25 */            I000II.I001IO000("No type in ProtoBuf.ValueParameter");
/* 28 */            return null;
                }

                public static final List I000iOII(OOi0O1i1lOi oOi0O1i1lOi, Oi0Oooi oi0Oooi) {
/* 1 */             List arrayList = oOi0O1i1lOi.I00ioIO;
/* 10 */            if (arrayList.isEmpty()) {
/* 13 */                arrayList = null;
                    }
/* 14 */            if (arrayList == null) {
/* 16 */                List list = oOi0O1i1lOi.I00l0I0l0lO1;
/* 28 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 31 */                Iterator it = list.iterator();
/* 39 */                while (it.hasNext()) {
/* 55 */                    arrayList.add(oi0Oooi.I00100l0(((Integer) it.next()).intValue()));
                        }
                    }
/* 89 */            return arrayList;
                }

                public static I011IO1I11OI I000l1(Context context, Callable callable, Executor executor) {
/* 5 */             i11I1Ili i11i1ili = new i11I1Ili(8);
/* 8 */             i11i1ili.I00iiI = callable;
/* 10 */            VarHandle.storeStoreFence();
/* 17 */            if (I000lI(context)) {
/* 21 */                OoIlol ooIlol = new OoIlol();
/* 29 */                ooIlol.I00l0I0l0lO1 = new OoIlliloii0(ooIlol, i11i1ili);
/* 31 */                executor.execute(ooIlol);
/* 34 */                return ooIlol;
                    }
/* 37 */            Oio0llilli oio0llilli = new Oio0llilli();
/* 42 */            AtomicBoolean atomicBoolean = new AtomicBoolean();
/* 49 */            lIO0IIIo lio0iiio = new lIO0IIIo(atomicBoolean, context, oio0llilli, i11i1ili, executor);
/* 59 */            context.registerReceiver(lio0iiio, new IntentFilter("android.intent.action.USER_UNLOCKED"));
/* 66 */            if (I000lI(context) && atomicBoolean.compareAndSet(false, true)) {
                        try {
/* 76 */                    context.unregisterReceiver(lio0iiio);
                        } catch (IllegalArgumentException e) {
/* 86 */                    Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                        }
/* 91 */                OoIlol ooIlol2 = new OoIlol();
/* 99 */                ooIlol2.I00l0I0l0lO1 = new OoIlliloii0(ooIlol2, i11i1ili);
/* 101 */               executor.execute(ooIlol2);
/* 104 */               oio0llilli.I000o00OoI0I(ooIlol2);
/* 107 */               return oio0llilli;
                    }
/* 112 */           IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(10);
/* 115 */           iO0iIlI1li.I00iiI = oio0llilli;
/* 117 */           iO0iIlI1li.I00iiO = atomicBoolean;
/* 119 */           iO0iIlI1li.I00iio = context;
/* 121 */           iO0iIlI1li.I00ilI0I1 = lio0iiio;
/* 123 */           VarHandle.storeStoreFence();
/* 128 */           oio0llilli.addListener(iO0iIlI1li, Iii11Ooi.I00iOIl);
/* 215 */           return oio0llilli;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
                
                    r5 = true;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I000lI(Context context) {
                    boolean z;
/* 4 */             if (I00000oOI) {
/* 3 */                 return true;
                    }
                    synchronized (lIOOli.class) {
                        try {
/* 12 */                    if (I00000oOI) {
/* 3 */                         return true;
                            }
/* 18 */                    int i = 1;
                            while (true) {
/* 21 */                        z = false;
/* 22 */                        if (i > 2) {
                                    break;
                                }
/* 24 */                        UserManager userManager = I00000oIO;
/* 26 */                        if (userManager == null) {
/* 34 */                            userManager = (UserManager) context.getSystemService(UserManager.class);
/* 36 */                            I00000oIO = userManager;
                                }
/* 38 */                        if (userManager == null) {
/* 40 */                            z = true;
                                    break;
                                }
                                try {
/* 46 */                            if (userManager.isUserUnlocked()) {
                                        break;
                                    }
/* 56 */                            if (!userManager.isUserRunning(Process.myUserHandle())) {
                                        break;
                                    }
                                } catch (NullPointerException e) {
/* 65 */                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
/* 68 */                            I00000oIO = null;
/* 70 */                            i++;
                                }
                            }
/* 73 */                    if (z) {
/* 75 */                        I00000oIO = null;
                            }
/* 77 */                    if (z) {
/* 79 */                        I00000oOI = true;
                            }
/* 82 */                    return z;
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
                }
            }
