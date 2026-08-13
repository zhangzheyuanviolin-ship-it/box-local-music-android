            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Logger;
            
            public abstract class OOoiolOO0i {
                public static final AtomicReference I00000oIO;
                public static final ConcurrentHashMap I00000oOI;
                public static final ConcurrentHashMap I0000Il00O;
                public static final ConcurrentHashMap I0000O;

                static {
/* 7 */             Logger.getLogger(OOoiolOO0i.class.getName());
/* 14 */            O0O1ol01lo1 o0O1ol01lo1 = new O0O1ol01lo1();
/* 22 */            o0O1ol01lo1.I00000oIO = new ConcurrentHashMap();
/* 24 */            VarHandle.storeStoreFence();
/* 30 */            I00000oIO = new AtomicReference(o0O1ol01lo1);
/* 37 */            I00000oOI = new ConcurrentHashMap();
/* 44 */            I0000Il00O = new ConcurrentHashMap();
/* 48 */            new ConcurrentHashMap();
/* 56 */            I0000O = new ConcurrentHashMap();
                }

                public static synchronized void I00000oIO(String str, Map map, boolean z) {
/* 6 */             if (z) {
                        try {
/* 8 */                     ConcurrentHashMap concurrentHashMap = I0000Il00O;
/* 14 */                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
/* 46 */                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                            }
                        } finally {
                        }
                    }
/* 50 */            if (z) {
/* 66 */                if (((O0O1ol01lo1) I00000oIO.get()).I00000oIO.containsKey(str)) {
/* 80 */                    for (Map.Entry entry : map.entrySet()) {
/* 98 */                        if (!I0000O.containsKey(entry.getKey())) {
/* 137 */                           throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                                }
                            }
                        } else {
/* 150 */                   for (Map.Entry entry2 : map.entrySet()) {
/* 168 */                       if (I0000O.containsKey(entry2.getKey())) {
/* 199 */                           throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                                }
                            }
                        }
                    }
                }

                public static Object I00000oOI(l0il1i0011O l0il1i0011o, Class cls) {
/* 9 */             OOIiIl1oiiIo oOIiIl1oiiIo = (OOIiIl1oiiIo) OI0oolioiO.I00000oOI.I00000oIO.get();
/* 11 */            oOIiIl1oiiIo.getClass();
/* 20 */            OOIiI0lIo0Ii oOIiI0lIo0Ii = new OOIiI0lIo0Ii(l0il1i0011o.getClass(), cls);
/* 23 */            HashMap map = oOIiIl1oiiIo.I00000oIO;
/* 29 */            if (map.containsKey(oOIiI0lIo0Ii)) {
/* 39 */                return ((OOIOlI0lIO) map.get(oOIiI0lIo0Ii)).I00000oOI.I0000Il00O(l0il1i0011o);
                    }
/* 48 */            OIiilo1Ool0o.I000oI1ioi(oOIiI0lIo0Ii, "No PrimitiveConstructor for ", " available");
/* 51 */            return null;
                }

                public static Object I0000Il00O(String str, IIOI1Ii1I iIOI1Ii1I, Class cls) {
/* 7 */             O0O1ol01lo1 o0O1ol01lo1 = (O0O1ol01lo1) I00000oIO.get();
/* 9 */             o0O1ol01lo1.getClass();
/* 12 */            O0O1o1loi o0O1o1loiI00000oIO = o0O1ol01lo1.I00000oIO(str);
/* 22 */            Set setKeySet = ((Map) o0O1o1loiI00000oIO.I00000oIO.I0000O).keySet();
/* 26 */            O0OIoll1 o0OIoll1 = o0O1o1loiI00000oIO.I00000oIO;
/* 32 */            if (!setKeySet.contains(cls)) {
/* 156 */               StringBuilder sb = new StringBuilder("Primitive type ");
/* 163 */               sb.append(cls.getName());
/* 168 */               sb.append(" not supported by key manager of type ");
/* 175 */               sb.append(o0OIoll1.getClass());
/* 180 */               sb.append(", supported primitives: ");
/* 187 */               Set<Class> setKeySet2 = ((Map) o0OIoll1.I0000O).keySet();
/* 193 */               StringBuilder sb2 = new StringBuilder();
/* 200 */               boolean z = true;
/* 205 */               for (Class cls2 : setKeySet2) {
/* 213 */                   if (!z) {
/* 217 */                       sb2.append(", ");
                            }
/* 224 */                   sb2.append(cls2.getCanonicalName());
/* 227 */                   z = false;
                        }
/* 233 */               sb.append(sb2.toString());
/* 2160 */              throw new GeneralSecurityException(sb.toString());
                    }
                    try {
/* 48 */                if (!((Map) o0OIoll1.I0000O).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 92 */                    throw new IllegalArgumentException("Given internalKeyMananger " + o0OIoll1.toString() + " does not support primitive class " + cls.getName());
                        }
                        try {
/* 95 */                    I01Iio10lo i01Iio10loI000O01llI0 = o0OIoll1.I000O01llI0(iIOI1Ii1I);
/* 103 */                   if (Void.class.equals(cls)) {
/* 120 */                       throw new GeneralSecurityException("Cannot create a primitive for Void");
                            }
/* 105 */                   o0OIoll1.I000OiO(i01Iio10loI000O01llI0);
/* 108 */                   return o0OIoll1.I0000oI00(i01Iio10loI000O01llI0, cls);
                        } catch (O000oiiiOI0 e) {
/* 141 */                   throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) o0OIoll1.I00000oOI).getName()), e);
                        }
                    } catch (IllegalArgumentException e2) {
/* 149 */               throw new GeneralSecurityException("Primitive type not supported", e2);
                    }
                }

                public static synchronized O0O1ioi11l0 I0000O(O0OIIIoOilol o0OIIIoOilol) {
                    IIOOoll iIOOoll;
/* 24 */            O0OIoll1 o0OIoll1 = ((O0O1ol01lo1) I00000oIO.get()).I00000oIO(o0OIIIoOilol.I001lIiIIo1O()).I00000oIO;
/* 28 */            Class cls = (Class) o0OIoll1.I0000Il00O;
/* 32 */            iIOOoll = new IIOOoll(18);
/* 47 */            if (!((Map) o0OIoll1.I0000O).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 93 */                throw new IllegalArgumentException("Given internalKeyMananger " + o0OIoll1.toString() + " does not support primitive class " + cls.getName());
                    }
/* 94 */            iIOOoll.I00iiI = o0OIoll1;
/* 96 */            VarHandle.storeStoreFence();
/* 115 */           if (!((Boolean) I0000Il00O.get(o0OIIIoOilol.I001lIiIIo1O())).booleanValue()) {
/* 150 */               throw new GeneralSecurityException("newKey-operation not permitted for key type " + o0OIIIoOilol.I001lIiIIo1O());
                    }
/* 121 */           return iIOOoll.I00OI1(o0OIIIoOilol.I001lllioOl());
                }

                public static synchronized void I0000oI00(O0OIoll1 o0OIoll1, boolean z) {
                    try {
/* 6 */                 AtomicReference atomicReference = I00000oIO;
/* 12 */                O0O1ol01lo1 o0O1ol01lo1 = (O0O1ol01lo1) atomicReference.get();
/* 14 */                O0O1ol01lo1 o0O1ol01lo12 = new O0O1ol01lo1();
/* 24 */                o0O1ol01lo12.I00000oIO = new ConcurrentHashMap(o0O1ol01lo1.I00000oIO);
/* 26 */                o0O1ol01lo12.I00000oOI(o0OIoll1);
/* 29 */                String strI0000O = o0OIoll1.I0000O();
/* 48 */                I00000oIO(strI0000O, z ? o0OIoll1.I0001Ioi1lo().I000II() : Collections.EMPTY_MAP, z);
/* 63 */                if (!((O0O1ol01lo1) atomicReference.get()).I00000oIO.containsKey(strI0000O)) {
/* 74 */                    I00000oOI.put(strI0000O, new lolIo0(14));
/* 77 */                    if (z) {
/* 87 */                        I0001Ioi1lo(strI0000O, o0OIoll1.I0001Ioi1lo().I000II());
                            }
                        }
/* 96 */                I0000Il00O.put(strI0000O, Boolean.valueOf(z));
/* 99 */                atomicReference.set(o0O1ol01lo12);
                    } catch (Throwable th) {
/* 551 */               throw th;
                    }
                }

                public static void I0001Ioi1lo(String str, Map map) {
                    OIl1lli oIl1lli;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                String str2 = (String) entry.getKey();
/* 37 */                byte[] bArrI0000oI00 = ((I01Iio10lo) ((O0OIol0o) entry.getValue()).I00000oIO).I0000oI00();
/* 47 */                int i = ((O0OIol0o) entry.getValue()).I00000oOI;
/* 51 */                O0OIIIio01 o0OIIIio01I001lloI = O0OIIIoOilol.I001lloI();
/* 55 */                o0OIIIio01I001lloI.I0000oI00();
/* 62 */                ((O0OIIIoOilol) o0OIIIio01I001lloI.I00iiI).I00II0oii1o(str);
/* 67 */                IIO1i10I iIO1i10II0000oI00 = IIOI1Ii1I.I0000oI00(bArrI0000oI00, 0, bArrI0000oI00.length);
/* 71 */                o0OIIIio01I001lloI.I0000oI00();
/* 78 */                ((O0OIIIoOilol) o0OIIIio01I001lloI.I00iiI).I00IO1(iIO1i10II0000oI00);
/* 81 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 85 */                if (iI001lIiIIo1O == 0) {
/* 111 */                   oIl1lli = OIl1lli.TINK;
                        } else if (iI001lIiIIo1O == 1) {
/* 108 */                   oIl1lli = OIl1lli.LEGACY;
                        } else if (iI001lIiIIo1O == 2) {
/* 105 */                   oIl1lli = OIl1lli.RAW;
                        } else {
/* 94 */                    if (iI001lIiIIo1O != 3) {
/* 101 */                       I000II.I000iOII("Unknown output prefix type");
/* 104 */                       return;
                            }
/* 96 */                    oIl1lli = OIl1lli.CRUNCHY;
                        }
/* 113 */               o0OIIIio01I001lloI.I0000oI00();
/* 120 */               ((O0OIIIoOilol) o0OIIIio01I001lloI.I00iiI).I00II0Ol1O0l(oIl1lli);
/* 127 */               O0OIIIoOilol o0OIIIoOilol = (O0OIIIoOilol) o0OIIIio01I001lloI.I00000oOI();
/* 129 */               O0OIIioi o0OIIioi = new O0OIIioi();
/* 132 */               o0OIIioi.I00000oIO = o0OIIIoOilol;
/* 134 */               VarHandle.storeStoreFence();
/* 139 */               I0000O.put(str2, o0OIIioi);
                    }
                }

                public static synchronized void I000II(OOIil101I0I oOIil101I0I) {
/* 4 */             OI0oolioiO oI0oolioiO = OI0oolioiO.I00000oOI;
                    synchronized (oI0oolioiO) {
/* 13 */                OOIiIl1oiiIo oOIiIl1oiiIo = (OOIiIl1oiiIo) oI0oolioiO.I00000oIO.get();
/* 19 */                HashMap map = new HashMap(oOIiIl1oiiIo.I00000oIO);
/* 26 */                HashMap map2 = new HashMap(oOIiIl1oiiIo.I00000oOI);
/* 29 */                if (oOIil101I0I == null) {
/* 122 */                   throw new NullPointerException("wrapper must be non-null");
                        }
/* 31 */                Class clsI00000oOI = oOIil101I0I.I00000oOI();
/* 39 */                if (map2.containsKey(clsI00000oOI)) {
/* 45 */                    OOIil101I0I oOIil101I0I2 = (OOIil101I0I) map2.get(clsI00000oOI);
/* 51 */                    if (!oOIil101I0I2.equals(oOIil101I0I) || !oOIil101I0I.equals(oOIil101I0I2)) {
/* 79 */                        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsI00000oOI);
                            }
                        } else {
/* 80 */                    map2.put(clsI00000oOI, oOIil101I0I);
                        }
/* 85 */                OOIiIl1oiiIo oOIiIl1oiiIo2 = new OOIiIl1oiiIo();
/* 93 */                oOIiIl1oiiIo2.I00000oIO = new HashMap(map);
/* 100 */               oOIiIl1oiiIo2.I00000oOI = new HashMap(map2);
/* 102 */               VarHandle.storeStoreFence();
/* 107 */               oI0oolioiO.I00000oIO.set(oOIiIl1oiiIo2);
                    }
                }
            }
