            package p000;

            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import java.io.UnsupportedEncodingException;
            import java.util.Arrays;
            
            public abstract class l1O1iiOOil1o extends i0IiIO implements IInterface {
                public final int I000O01llI0;

                public l1O1iiOOil1o(byte[] bArr) {
/* 5 */             super("com.google.android.gms.common.internal.ICertData", 9);
/* 16 */            lII0I0I000I.I00000oOI(bArr.length == 25);
/* 23 */            this.I000O01llI0 = Arrays.hashCode(bArr);
                }

                public static byte[] I00O10llo(String str) {
                    try {
/* 3 */                 return str.getBytes("ISO-8859-1");
                    } catch (UnsupportedEncodingException e) {
/* 9 */                 I000II.I000O01llI0(e);
/* 12 */                return null;
                    }
                }

                @Override
                public final boolean I00Iooi00oi(int i, Parcel parcel, Parcel parcel2) {
/* 2 */             if (i == 1) {
/* 18 */                IoOlilli0ol ioOlilli0olI00O0o1oo = I00O0o1oo();
/* 22 */                parcel2.writeNoException();
/* 25 */                iil1OIloI1i.I00000oOI(parcel2, ioOlilli0olI00O0o1oo);
/* 1 */                 return true;
                    }
/* 5 */             if (i != 2) {
/* 7 */                 return false;
                    }
/* 9 */             parcel2.writeNoException();
/* 14 */            parcel2.writeInt(this.I000O01llI0);
/* 1 */             return true;
                }

                public abstract byte[] I00O0i0ii();

                public final IoOlilli0ol I00O0o1oo() {
/* 5 */             return OIOiOlIO01.I00O10llo(I00O0i0ii());
                }

                public final boolean equals(Object obj) {
                    IoOlilli0ol ioOlilli0olI00O0o1oo;
/* 4 */             if (obj instanceof l1O1iiOOil1o) {
                        try {
/* 7 */                     l1O1iiOOil1o l1o1iiooil1o = (l1O1iiOOil1o) obj;
/* 13 */                    if (l1o1iiooil1o.I000O01llI0 == this.I000O01llI0 && (ioOlilli0olI00O0o1oo = l1o1iiooil1o.I00O0o1oo()) != null) {
/* 32 */                        return Arrays.equals(I00O0i0ii(), (byte[]) OIOiOlIO01.I00O0o1oo(ioOlilli0olI00O0o1oo));
                            }
                        } catch (RemoteException e) {
/* 44 */                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             return this.I000O01llI0;
                }
            }
