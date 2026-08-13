            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class iIolll0O {
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public OIOi0lOI I0000Il00O;

                public byte[] I00000oIO(l1Ioi1ioOI l1ioi1iooi) {
                    iIii0o iiii0o;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 8 */                 HashMap map = this.I00000oIO;
/* 10 */                HashMap map2 = this.I00000oOI;
/* 12 */                OIOi0lOI oIOi0lOI2 = this.I0000Il00O;
/* 14 */                iiii0o = new iIii0o();
/* 20 */                OOiI1O oOiI1O = new OOiI1O(1);
/* 24 */                oOiI1O.I00000oOI = false;
/* 26 */                oOiI1O.I0000Il00O = false;
/* 28 */                oOiI1O.I0000oI00 = iiii0o;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                iiii0o.I0000oI00 = oOiI1O;
/* 35 */                iiii0o.I00000oIO = byteArrayOutputStream;
/* 37 */                iiii0o.I00000oOI = map;
/* 39 */                iiii0o.I0000Il00O = map2;
/* 41 */                iiii0o.I0000O = oIOi0lOI2;
/* 43 */                VarHandle.storeStoreFence();
/* 52 */                oIOi0lOI = (OIOi0lOI) map.get(l1Ioi1ioOI.class);
                    } catch (IOException unused) {
                    }
/* 54 */            if (oIOi0lOI == null) {
/* 75 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(l1Ioi1ioOI.class)));
                    }
/* 56 */            oIOi0lOI.encode(l1ioi1iooi, iiii0o);
/* 76 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I00000oOI(li1IOoo li1iooo) {
                    iill0lOo10 iill0loo10;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 8 */                 HashMap map = this.I00000oIO;
/* 10 */                HashMap map2 = this.I00000oOI;
/* 12 */                OIOi0lOI oIOi0lOI2 = this.I0000Il00O;
/* 14 */                iill0loo10 = new iill0lOo10();
/* 20 */                OOiI1O oOiI1O = new OOiI1O(4);
/* 24 */                oOiI1O.I00000oOI = false;
/* 26 */                oOiI1O.I0000Il00O = false;
/* 28 */                oOiI1O.I0000oI00 = iill0loo10;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                iill0loo10.I0000oI00 = oOiI1O;
/* 35 */                iill0loo10.I00000oIO = byteArrayOutputStream;
/* 37 */                iill0loo10.I00000oOI = map;
/* 39 */                iill0loo10.I0000Il00O = map2;
/* 41 */                iill0loo10.I0000O = oIOi0lOI2;
/* 43 */                VarHandle.storeStoreFence();
/* 52 */                oIOi0lOI = (OIOi0lOI) map.get(li1IOoo.class);
                    } catch (IOException unused) {
                    }
/* 54 */            if (oIOi0lOI == null) {
/* 75 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(li1IOoo.class)));
                    }
/* 56 */            oIOi0lOI.encode(li1iooo, iill0loo10);
/* 76 */            return byteArrayOutputStream.toByteArray();
                }
            }
