            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.logging.Logger;
            
            public final class O0O1ol01lo1 {
                public static final Logger I00000oOI = Logger.getLogger(O0O1ol01lo1.class.getName());
                public ConcurrentHashMap I00000oIO;

                public final synchronized O0O1o1loi I00000oIO(String str) {
/* 10 */            if (!this.I00000oIO.containsKey(str)) {
/* 41 */                throw new GeneralSecurityException("No key manager found for key type " + str);
                    }
/* 18 */            return (O0O1o1loi) this.I00000oIO.get(str);
                }

                public final synchronized void I00000oOI(O0OIoll1 o0OIoll1) {
/* 4 */             int iI0000Il00O = o0OIoll1.I0000Il00O();
/* 20 */            if (!(iI0000Il00O != 1 ? Oi010OO0.I0001Ioi1lo(iI0000Il00O) : Oi010OO0.I0000oI00(iI0000Il00O))) {
/* 65 */                throw new GeneralSecurityException("failed to register key manager " + o0OIoll1.getClass() + " as it is not FIPS compatible.");
                    }
/* 24 */            O0O1o1loi o0O1o1loi = new O0O1o1loi();
/* 27 */            o0O1o1loi.I00000oIO = o0OIoll1;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I0000Il00O(o0O1o1loi);
                }

                public final synchronized void I0000Il00O(O0O1o1loi o0O1o1loi) {
/* 6 */             O0OIoll1 o0OIoll1 = o0O1o1loi.I00000oIO;
/* 10 */            Class cls = (Class) o0OIoll1.I0000Il00O;
/* 24 */            if (!((Map) o0OIoll1.I0000O).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 70 */                throw new IllegalArgumentException("Given internalKeyMananger " + o0OIoll1.toString() + " does not support primitive class " + cls.getName());
                    }
/* 71 */            String strI0000O = o0OIoll1.I0000O();
/* 81 */            O0O1o1loi o0O1o1loi2 = (O0O1o1loi) this.I00000oIO.get(strI0000O);
/* 83 */            if (o0O1o1loi2 != null && !o0O1o1loi2.I00000oIO.getClass().equals(o0O1o1loi.I00000oIO.getClass())) {
/* 110 */               I00000oOI.warning("Attempted overwrite of a registered key manager for key type ".concat(strI0000O));
/* 166 */               throw new GeneralSecurityException("typeUrl (" + strI0000O + ") is already registered with " + o0O1o1loi2.I00000oIO.getClass().getName() + ", cannot be re-registered with " + o0O1o1loi.I00000oIO.getClass().getName());
                    }
/* 171 */           this.I00000oIO.putIfAbsent(strI0000O, o0O1o1loi);
                }
            }
