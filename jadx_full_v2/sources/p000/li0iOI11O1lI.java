            package p000;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
            public abstract class li0iOI11O1lI {
                public static final il11lo I00000oIO;
                public static final il11lo I00000oOI;
                public static volatile i1lioI I0000Il00O;
                public static final Object I0000O;
                public static Context I0000oI00;

                static {
/* 10 */            new il11lo(0, l1O1iiOOil1o.I00O10llo("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
/* 22 */            new il11lo(1, l1O1iiOOil1o.I00O10llo("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
/* 34 */            new il11lo(2, l1O1iiOOil1o.I00O10llo("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
/* 46 */            new il11lo(3, l1O1iiOOil1o.I00O10llo("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
/* 61 */            I00000oIO = new il11lo(4, l1O1iiOOil1o.I00O10llo("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
/* 75 */            I00000oOI = new il11lo(5, l1O1iiOOil1o.I00O10llo("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
/* 82 */            I0000O = new Object();
                }

                public static void I00000oIO() {
                    i1lioI i1oiiiiil;
/* 3 */             if (I0000Il00O != null) {
/* 5 */                 return;
                    }
/* 8 */             lII0I0I000I.I000II(I0000oI00);
                    synchronized (I0000O) {
                        try {
/* 16 */                    if (I0000Il00O == null) {
/* 30 */                        IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(I0000oI00, IioIii0IO.I0000oI00, "com.google.android.gms.googlecertificates").I00000oOI("com.google.android.gms.common.GoogleCertificatesImpl");
/* 34 */                        int i = i1iil0I.I000O01llI0;
/* 38 */                        if (iBinderI00000oOI == null) {
/* 40 */                            i1oiiiiil = null;
                                } else {
/* 42 */                            IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
/* 58 */                            i1oiiiiil = iInterfaceQueryLocalInterface instanceof i1lioI ? (i1lioI) iInterfaceQueryLocalInterface : new i1OiIiiIl(iBinderI00000oOI, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 10);
                                }
/* 62 */                        I0000Il00O = i1oiiiiil;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public static IIOo1i I00000oOI(String str, l1oliollOo l1oliolloo, boolean z, boolean z2) {
                    try {
/* 5 */                 I00000oIO();
/* 10 */                lII0I0I000I.I000II(I0000oI00);
                        try {
/* 13 */                    i1lioI i1lioi = I0000Il00O;
/* 21 */                    OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(I0000oI00.getPackageManager());
/* 25 */                    i1OiIiiIl i1oiiiiil = (i1OiIiiIl) i1lioi;
/* 27 */                    Parcel parcelI00Iooi00oi = i1oiiiiil.I00Iooi00oi();
/* 31 */                    int i = iil1OIloI1i.I00000oIO;
/* 33 */                    boolean z3 = true;
/* 34 */                    parcelI00Iooi00oi.writeInt(1);
/* 39 */                    int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 43 */                    lO0IioIooIl.I000OiO(parcelI00Iooi00oi, 1, str);
/* 47 */                    lO0IioIooIl.I0001Ioi1lo(parcelI00Iooi00oi, 2, l1oliolloo);
/* 52 */                    lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 55 */                    parcelI00Iooi00oi.writeInt(z ? 1 : 0);
/* 58 */                    lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 61 */                    parcelI00Iooi00oi.writeInt(z2 ? 1 : 0);
/* 64 */                    lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 67 */                    iil1OIloI1i.I00000oOI(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 71 */                    Parcel parcelI00IoO0 = i1oiiiiil.I00IoO0(5, parcelI00Iooi00oi);
/* 80 */                    if (parcelI00IoO0.readInt() == 0) {
/* 83 */                        z3 = false;
                            }
/* 84 */                    parcelI00IoO0.recycle();
/* 87 */                    if (z3) {
/* 89 */                        return IIOo1i.I0000oI00;
                            }
/* 94 */                    lIOlII0I1i liolii0i1i = new lIOlII0I1i();
/* 97 */                    liolii0i1i.I00000oIO = z;
/* 99 */                    liolii0i1i.I00000oOI = str;
/* 101 */                   liolii0i1i.I0000Il00O = l1oliolloo;
/* 103 */                   VarHandle.storeStoreFence();
/* 109 */                   o0iIi11Ii o0iii11ii = new o0iIi11Ii(false, null, null);
/* 112 */                   o0iii11ii.I0001Ioi1lo = liolii0i1i;
/* 114 */                   VarHandle.storeStoreFence();
/* 117 */                   return o0iii11ii;
                        } catch (RemoteException e) {
/* 119 */                   Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
/* 124 */                   return IIOo1i.I001lloI("module call", e);
                        }
                    } catch (IioI1I1llol1 e2) {
/* 130 */               Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
/* 147 */               return IIOo1i.I001lloI("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                    }
                }
            }
