            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.util.Base64;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            import com.google.firebase.datatransport.TransportRegistrar;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.NoSuchElementException;
            
/* 47 */    public final class OIiilo1Ool0o implements Illill0o, Iiio1OI0O0i, OiIIOlilOlo, OliiillO, IOiOiIIiii1 {
                public final int I00iOIl;

                public OIiilo1Ool0o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static void I00000oIO() {
/* 29 */            throw new ClassCastException();
                }

                public static void I00000oOI(int i, String str) {
/* 89 */            throw new IllegalStateException((str + i).toString());
                }

                public static void I0000Il00O(int i, StringBuilder sb) {
/* 1 */             sb.append(i);
/* 89 */            throw new IndexOutOfBoundsException(sb.toString());
                }

                public static void I0000oI00(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalStateException((str + obj + obj2).toString());
                }

                public static void I0001Ioi1lo(Object obj, StringBuilder sb) {
/* 3 */             sb.append(", ");
/* 6 */             sb.append(obj);
/* 89 */            throw new IllegalStateException(sb.toString().toString());
                }

                public static void I000II(String str) {
/* 49 */            throw new NoSuchElementException(str);
                }

                public static void I000O01llI0(String str, Object obj) {
/* 89 */            throw new IllegalArgumentException((str + obj).toString());
                }

                public static void I000OOo1O(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
                }

                public static void I000OiO(String str, Object obj, Object obj2, Object obj3, Object obj4) {
/* 966 */           throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
                }

                public static void I000iOII(String str, Throwable th) {
/* 89 */            throw new RuntimeException(str, th);
                }

                public static void I000l1(String str, Object[] objArr) {
/* 89 */            throw new IllegalArgumentException(String.format(str, objArr));
                }

                public static void I000lI() {
/* 29 */            throw new UnsupportedOperationException();
                }

                public static void I000o00OoI0I(int i, StringBuilder sb) {
/* 1 */             sb.append(i);
/* 89 */            throw new IllegalArgumentException(sb.toString());
                }

                public static void I000oI1ioi(Object obj, String str, Object obj2) throws GeneralSecurityException {
/* 215 */           throw new GeneralSecurityException(str + obj + obj2);
                }

                public static void I00100l0(String str, Object obj) {
/* 89 */            throw new IllegalStateException((str + obj).toString());
                }

                public static void I00100o1O0lo() {
/* 29 */            throw new IllegalArgumentException();
                }

                public static void I0010I0i(Object obj, String str, Object obj2) {
/* 215 */           throw new IOiIIo1l(str + obj + obj2, 1);
                }

                public static void I0010o(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalArgumentException((str + obj + obj2).toString());
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 4:
/* 91 */                    return OOIl1Io0.I00000oOI;
                        case 10:
/* 86 */                    String str = RemoteWorkManagerClient.I000OOo1O;
/* 3 */                     return null;
                        default:
/* 14 */                    Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                            try {
/* 20 */                        ArrayList arrayList = new ArrayList();
/* 27 */                        while (cursorRawQuery.moveToNext()) {
/* 29 */                            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 38 */                            iOO000iloI00000oIO.I00IO1oi11O(cursorRawQuery.getString(1));
/* 50 */                            iOO000iloI00000oIO.I00iio = OOIioI1.I00000oOI(cursorRawQuery.getInt(2));
/* 53 */                            String string = cursorRawQuery.getString(3);
/* 65 */                            iOO000iloI00000oIO.I00iiO = string == null ? null : Base64.decode(string, 0);
/* 71 */                            arrayList.add(iOO000iloI00000oIO.I000OOo1O());
                                }
/* 78 */                        return arrayList;
                            } finally {
/* 80 */                        cursorRawQuery.close();
                            }
                    }
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 3 */             I1ii1o0 i1ii1o0 = (I1ii1o0) iOiOIoiiO0i;
                    switch (this.I00iOIl) {
                        case 27:
/* 1 */                     return TransportRegistrar.lambda$getComponents$0(i1ii1o0);
                        case PoseLandmark.RIGHT_ANKLE:
/* 1 */                     return TransportRegistrar.lambda$getComponents$1(i1ii1o0);
                        default:
/* 1 */                     return TransportRegistrar.lambda$getComponents$2(i1ii1o0);
                    }
                }

                @Override
                public Object get() {
/* 29 */            throw new IllegalStateException();
                }

                @Override
/* 48 */        public double I0000O(double d) {
/* 49 */            return d;
                }
            }
