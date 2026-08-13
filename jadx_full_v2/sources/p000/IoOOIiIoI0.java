            package p000;

            import android.net.Uri;
            import java.lang.invoke.VarHandle;
            
            public final class IoOOIiIoI0 implements IlIIoIo {
                public OllO00oiil I00000oIO;
                public OllO00oiil I00000oOI;

                @Override
                public final IlIO00OOi1OO I00000oIO(Object obj, OIil0IlIIol oIil0IlIIol) {
/* 1 */             Uri uri = (Uri) obj;
/* 13 */            if (!O0000Ioio00.I0000O(uri.getScheme(), "http") && !O0000Ioio00.I0000O(uri.getScheme(), "https")) {
/* 28 */                return null;
                    }
/* 32 */            String string = uri.toString();
/* 36 */            OllO00oiil ollO00oiil = this.I00000oIO;
/* 38 */            OllO00oiil ollO00oiil2 = this.I00000oOI;
/* 40 */            IoOOiOO0O ioOOiOO0O = new IoOOiOO0O();
/* 43 */            ioOOiOO0O.I00000oIO = string;
/* 45 */            ioOOiOO0O.I00000oOI = oIil0IlIIol;
/* 47 */            ioOOiOO0O.I0000Il00O = ollO00oiil;
/* 49 */            ioOOiOO0O.I0000O = ollO00oiil2;
/* 51 */            VarHandle.storeStoreFence();
/* 106 */           return ioOOiOO0O;
                }
            }
