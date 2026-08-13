            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OI0oolioiO {
                public static final OI0oolioiO I00000oOI;
                public AtomicReference I00000oIO;

                static {
/* 3 */             OI0oolioiO oI0oolioiO = new OI0oolioiO();
/* 10 */            HashMap map = new HashMap();
/* 15 */            HashMap map2 = new HashMap();
/* 20 */            OOIiIl1oiiIo oOIiIl1oiiIo = new OOIiIl1oiiIo();
/* 28 */            oOIiIl1oiiIo.I00000oIO = new HashMap(map);
/* 35 */            oOIiIl1oiiIo.I00000oOI = new HashMap(map2);
/* 37 */            VarHandle.storeStoreFence();
/* 43 */            oI0oolioiO.I00000oIO = new AtomicReference(oOIiIl1oiiIo);
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            I00000oOI = oI0oolioiO;
                }

                public final synchronized void I00000oIO(OOIOlI0lIO oOIOlI0lIO) {
/* 8 */             OOIiIl1oiiIo oOIiIl1oiiIo = (OOIiIl1oiiIo) this.I00000oIO.get();
/* 14 */            HashMap map = new HashMap(oOIiIl1oiiIo.I00000oIO);
/* 21 */            HashMap map2 = new HashMap(oOIiIl1oiiIo.I00000oOI);
/* 24 */            if (oOIOlI0lIO == null) {
/* 117 */               throw new NullPointerException("primitive constructor must be non-null");
                    }
/* 32 */            OOIiI0lIo0Ii oOIiI0lIo0Ii = new OOIiI0lIo0Ii(oOIOlI0lIO.I00000oIO, IOIIl1O00.class);
/* 39 */            if (map.containsKey(oOIiI0lIo0Ii)) {
/* 45 */                OOIOlI0lIO oOIOlI0lIO2 = (OOIOlI0lIO) map.get(oOIiI0lIo0Ii);
/* 51 */                if (!oOIOlI0lIO2.equals(oOIOlI0lIO) || oOIOlI0lIO != oOIOlI0lIO2) {
/* 75 */                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + oOIiI0lIo0Ii);
                        }
                    } else {
/* 76 */                map.put(oOIiI0lIo0Ii, oOIOlI0lIO);
                    }
/* 81 */            OOIiIl1oiiIo oOIiIl1oiiIo2 = new OOIiIl1oiiIo();
/* 89 */            oOIiIl1oiiIo2.I00000oIO = new HashMap(map);
/* 96 */            oOIiIl1oiiIo2.I00000oOI = new HashMap(map2);
/* 98 */            VarHandle.storeStoreFence();
/* 103 */           this.I00000oIO.set(oOIiIl1oiiIo2);
                }
            }
