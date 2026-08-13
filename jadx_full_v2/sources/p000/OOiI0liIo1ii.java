            package p000;

            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class OOiI0liIo1ii implements Il0IIIOll {
                public static final O01IO1I0 I0000O = new O01IO1I0(2);
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public O01IO1I0 I0000Il00O;

                public void I00000oIO(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
/* 3 */             HashMap map = this.I00000oIO;
/* 5 */             HashMap map2 = this.I00000oOI;
/* 7 */             O01IO1I0 o01io1i0 = this.I0000Il00O;
/* 9 */             OOiI0l0 oOiI0l0 = new OOiI0l0();
/* 15 */            OOiI1O oOiI1O = new OOiI1O(0);
/* 18 */            oOiI1O.I00000oOI = false;
/* 20 */            oOiI1O.I0000Il00O = false;
/* 22 */            oOiI1O.I0000oI00 = oOiI0l0;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            oOiI0l0.I0000oI00 = oOiI1O;
/* 29 */            oOiI0l0.I00000oIO = byteArrayOutputStream;
/* 31 */            oOiI0l0.I00000oOI = map;
/* 33 */            oOiI0l0.I0000Il00O = map2;
/* 35 */            oOiI0l0.I0000O = o01io1i0;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            if (obj == null) {
/* 42 */                return;
                    }
/* 51 */            OIOi0lOI oIOi0lOI = (OIOi0lOI) map.get(obj.getClass());
/* 53 */            if (oIOi0lOI != null) {
/* 55 */                oIOi0lOI.encode(obj, oOiI0l0);
/* 58 */                return;
                    }
/* 89 */            throw new Il0IO001iOOo("No encoder for " + obj.getClass());
                }

                @Override
                public Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
/* 3 */             this.I00000oIO.put(cls, oIOi0lOI);
/* 8 */             this.I00000oOI.remove(cls);
/* 89 */            return this;
                }
            }
