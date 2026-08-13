            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedInputStream;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class IIOo0oO0O1 {
                public static final ConcurrentHashMap I00000oIO = new ConcurrentHashMap();

                public static IIOo0liIi I00000oIO(String str) {
                    BufferedInputStream bufferedInputStreamI0001Ioi1lo;
/* 1 */             ConcurrentHashMap concurrentHashMap = I00000oIO;
/* 7 */             IIOo0liIi iIOo0liIi = (IIOo0liIi) concurrentHashMap.get(str);
/* 9 */             if (iIOo0liIi != null) {
/* 11 */                return iIOo0liIi;
                    }
/* 15 */            IIOo1i iIOo1i = new IIOo1i(0);
/* 22 */            iIOo1i.I0000Il00O = new byte[Barcode.FORMAT_UPC_A];
/* 24 */            iIOo1i.I00000oOI = false;
                    try {
/* 26 */                bufferedInputStreamI0001Ioi1lo = IIOo1i.I0001Ioi1lo(str);
                        try {
/* 30 */                    iIOo1i.I00000oOI = false;
/* 32 */                    IIOo0liIi iIOo0liIiI000o00OoI0I = iIOo1i.I000o00OoI0I(bufferedInputStreamI0001Ioi1lo);
/* 36 */                    bufferedInputStreamI0001Ioi1lo.close();
/* 41 */                    concurrentHashMap.put(iIOo0liIiI000o00OoI0I.I00000oOI, iIOo0liIiI000o00OoI0I);
/* 44 */                    return iIOo0liIiI000o00OoI0I;
                        } catch (Throwable th) {
/* 45 */                    th = th;
/* 49 */                    if (bufferedInputStreamI0001Ioi1lo != null) {
/* 51 */                        bufferedInputStreamI0001Ioi1lo.close();
                            }
/* 186 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 47 */                th = th2;
/* 48 */                bufferedInputStreamI0001Ioi1lo = null;
                    }
                }
            }
