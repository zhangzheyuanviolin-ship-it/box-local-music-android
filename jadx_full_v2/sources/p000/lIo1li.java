            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.NoSuchElementException;
            import java.util.concurrent.CancellationException;
            
            public abstract class lIo1li {
                /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:30:0x0086, B:32:0x008a, B:35:0x0098), top: B:44:0x0086 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r8v9, types: [byte[], java.io.Serializable] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Serializable I00000oIO(IInterface iInterface, OOooio11i00 oOooio11i00, IOoilo iOoilo) throws Throwable {
                    OOoolI0l oOoolI0l;
                    OOo0ooi oOo0ooi;
                    Throwable th;
                    IBinder iBinder;
/* 3 */             if (iOoilo instanceof OOoolI0l) {
/* 6 */                 oOoolI0l = (OOoolI0l) iOoilo;
/* 8 */                 int i = oOoolI0l.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOoolI0l.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOoolI0l = new OOoolI0l(iOoilo);
                        }
                    }
/* 25 */            Object obj = oOoolI0l.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOoolI0l.I00iio;
/* 33 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 61 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 64 */                IBinder iBinderAsBinder = iInterface.asBinder();
                        try {
/* 68 */                    oOoolI0l.I00iOIl = oOo0ooi2;
/* 73 */                    oOoolI0l.I00iiI = iBinderAsBinder;
/* 75 */                    oOoolI0l.I00iio = 1;
/* 83 */                    OiIOol0 oiIOol0 = new OiIOol0(l00iIoI.I0000Il00O(oOoolI0l));
/* 88 */                    OOoolll oOoolll = new OOoolll(0);
/* 91 */                    oOoolll.I00iiI = oiIOol0;
/* 93 */                    VarHandle.storeStoreFence();
/* 96 */                    oOo0ooi2.I00iOIl = oOoolll;
/* 98 */                    iBinderAsBinder.linkToDeath(oOoolll, 0);
/* 106 */                   oOooio11i00.I001lIiIIo1O(iInterface, new OOoolO01Ioo(oiIOol0));
/* 109 */                   Object objI00000oIO = oiIOol0.I00000oIO();
/* 113 */                   if (objI00000oIO == ii0111o) {
/* 115 */                       return ii0111o;
                            }
/* 116 */                   oOo0ooi = oOo0ooi2;
/* 117 */                   obj = objI00000oIO;
/* 118 */                   iBinder = iBinderAsBinder;
                        } catch (Throwable th2) {
/* 132 */                   oOo0ooi = oOo0ooi2;
/* 133 */                   th = th2;
/* 134 */                   iBinder = iBinderAsBinder;
/* 137 */                   if (!(th instanceof CancellationException)) {
/* 147 */                       IIi0oIl.I000II().I0001Ioi1lo(O10oOoo101iO.I0000oI00, "Unable to execute", th);
                            }
/* 153 */                   throw th;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 54 */                    return null;
                        }
/* 37 */                iBinder = oOoolI0l.I00iiI;
/* 41 */                oOo0ooi = oOoolI0l.I00iOIl;
                        try {
/* 43 */                    lIoii1l01l0i.I00000oOI(obj);
                        } catch (Throwable th3) {
/* 47 */                    th = th3;
                            try {
/* 137 */                       if (!(th instanceof CancellationException)) {
                                }
/* 153 */                       throw th;
                            } catch (Throwable th4) {
/* 156 */                       IBinder.DeathRecipient deathRecipient = (IBinder.DeathRecipient) oOo0ooi.I00iOIl;
/* 158 */                       if (deathRecipient != null) {
                                    try {
/* 160 */                               iBinder.unlinkToDeath(deathRecipient, 0);
                                    } catch (NoSuchElementException unused) {
                                    }
                                }
/* 408 */                       throw th4;
                            }
                        }
                    }
/* 119 */           ?? r8 = (byte[]) obj;
/* 123 */           IBinder.DeathRecipient deathRecipient2 = (IBinder.DeathRecipient) oOo0ooi.I00iOIl;
/* 125 */           if (deathRecipient2 != null) {
                        try {
/* 127 */                   iBinder.unlinkToDeath(deathRecipient2, 0);
                        } catch (NoSuchElementException unused2) {
                        }
                    }
/* 130 */           return r8;
                }
            }
