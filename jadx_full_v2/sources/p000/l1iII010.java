            package p000;

            import android.os.Parcelable;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iII010 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v19 */
                /* JADX WARN: Type inference failed for: r3v20 */
                /* JADX WARN: Type inference failed for: r3v29, types: [OII01iooio, OII0I1ii] */
                /* JADX WARN: Type inference failed for: r3v30, types: [OII001i, OII01iooio, OII0I1ii] */
                /* JADX WARN: Type inference failed for: r3v31, types: [OII00oI, OII0I1ii] */
                /* JADX WARN: Type inference failed for: r3v35, types: [OII01I110I11, OII0I1ii] */
                /* JADX WARN: Type inference failed for: r3v39, types: [OII00iiI, OII0I1ii] */
                /* JADX WARN: Type inference failed for: r3v44 */
                /* JADX WARN: Type inference failed for: r3v45 */
                /* JADX WARN: Type inference failed for: r3v46 */
                /* JADX WARN: Type inference failed for: r3v47 */
                /* JADX WARN: Type inference failed for: r3v48 */
                /* JADX WARN: Type inference failed for: r3v49 */
                /* JADX WARN: Type inference failed for: r3v50 */
                /* JADX WARN: Type inference failed for: r3v51 */
                /* JADX WARN: Type inference failed for: r3v52 */
                public static final OI1Iooo1I I00000oIO(String str, Function1 function1) {
/* 5 */             OI1OiOloi oI1OiOloi = new OI1OiOloi();
/* 10 */            IOloIIl1 iOloIIl1 = new IOloIIl1();
/* 13 */            oI1OiOloi.I00000oIO = iOloIIl1;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            function1.invoke(oI1OiOloi);
/* 23 */            OII0I1ii oII0I1ii = (OII0I1ii) iOloIIl1.I0000Il00O;
/* 26 */            if (oII0I1ii == null) {
/* 28 */                Object obj = iOloIIl1.I0000O;
/* 95 */                ?? oII01iooio = obj instanceof Integer ? OII0I1ii.I00000oOI : obj instanceof int[] ? OII0I1ii.I0000Il00O : obj instanceof Long ? OII0I1ii.I0000O : obj instanceof long[] ? OII0I1ii.I0000oI00 : obj instanceof Float ? OII0I1ii.I0001Ioi1lo : obj instanceof float[] ? OII0I1ii.I000II : obj instanceof Boolean ? OII0I1ii.I000O01llI0 : obj instanceof boolean[] ? OII0I1ii.I000OOo1O : ((obj instanceof String) || obj == null) ? OII0I1ii.I000OiO : 0;
/* 97 */                if (oII01iooio != 0) {
/* 192 */                   oII0I1ii = oII01iooio;
                        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
/* 110 */                   oII0I1ii = OII0I1ii.I000iOII;
                        } else {
/* 129 */                   if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
/* 151 */                       Class<?> componentType = obj.getClass().getComponentType();
/* 155 */                       oII01iooio = new OII00iiI(true);
/* 162 */                       if (!Parcelable.class.isAssignableFrom(componentType)) {
/* 202 */                           IioIoO10iOiI.I000o00OoI0I(componentType, " does not implement Parcelable.");
/* 25 */                            return null;
                                }
                                try {
/* 187 */                           oII01iooio.I000l1 = Class.forName("[L" + componentType.getName() + ';');
/* 189 */                           VarHandle.storeStoreFence();
                                } catch (ClassNotFoundException e) {
/* 196 */                           IioIoO10iOiI.I000lI(e);
/* 25 */                            return null;
                                }
                            } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
/* 240 */                       Class<?> componentType2 = obj.getClass().getComponentType();
/* 244 */                       oII01iooio = new OII01I110I11(true);
/* 251 */                       if (!Serializable.class.isAssignableFrom(componentType2)) {
/* 287 */                           IioIoO10iOiI.I000o00OoI0I(componentType2, " does not implement Serializable.");
/* 25 */                            return null;
                                }
                                try {
/* 276 */                           oII01iooio.I000l1 = Class.forName("[L" + componentType2.getName() + ';');
/* 278 */                           VarHandle.storeStoreFence();
                                } catch (ClassNotFoundException e2) {
/* 283 */                           IioIoO10iOiI.I000lI(e2);
/* 25 */                            return null;
                                }
                            } else if (obj instanceof Parcelable) {
/* 297 */                       Class<?> cls = obj.getClass();
/* 301 */                       oII01iooio = new OII00oI(true);
/* 308 */                       if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
/* 319 */                           IioIoO10iOiI.I000o00OoI0I(cls, " does not implement Parcelable or Serializable.");
/* 25 */                            return null;
                                }
/* 323 */                       oII01iooio.I000l1 = cls;
/* 325 */                       VarHandle.storeStoreFence();
                            } else if (obj instanceof Enum) {
/* 336 */                       Class<?> cls2 = obj.getClass();
/* 341 */                       oII01iooio = new OII001i(false);
/* 348 */                       if (!Serializable.class.isAssignableFrom(cls2)) {
/* 371 */                           IioIoO10iOiI.I000o00OoI0I(cls2, " does not implement Serializable.");
/* 25 */                            return null;
                                }
/* 350 */                       oII01iooio.I000l1 = cls2;
/* 356 */                       if (!cls2.isEnum()) {
/* 367 */                           IioIoO10iOiI.I000o00OoI0I(cls2, " is not an Enum type.");
/* 25 */                            return null;
                                }
/* 358 */                       oII01iooio.I000lI = cls2;
/* 360 */                       VarHandle.storeStoreFence();
                            } else {
/* 377 */                       if (!(obj instanceof Serializable)) {
/* 426 */                           IoOOl0iOl1io.I000o00OoI0I(obj.getClass().getName(), "Object of type ", " is not supported for navigation arguments.");
/* 25 */                            return null;
                                }
/* 381 */                       Class<?> cls3 = obj.getClass();
/* 385 */                       oII01iooio = new OII01iooio(true);
/* 392 */                       if (!Serializable.class.isAssignableFrom(cls3)) {
/* 410 */                           IioIoO10iOiI.I000o00OoI0I(cls3, " does not implement Serializable.");
/* 25 */                            return null;
                                }
/* 398 */                       if (cls3.isEnum()) {
/* 406 */                           IioIoO10iOiI.I000o00OoI0I(cls3, " is an Enum. You should use EnumType instead.");
/* 25 */                            return null;
                                }
/* 400 */                       oII01iooio.I000l1 = cls3;
                            }
/* 192 */                   oII0I1ii = oII01iooio;
                        }
                    }
/* 432 */           boolean z = iOloIIl1.I00000oIO;
/* 434 */           Object obj2 = iOloIIl1.I0000O;
/* 436 */           boolean z2 = iOloIIl1.I00000oOI;
/* 438 */           OI1Oi1 oI1Oi1 = new OI1Oi1();
/* 443 */           if (!oII0I1ii.I00000oIO && z) {
/* 458 */               I000II.I0010I0i(oII0I1ii.I00000oOI().concat(" does not allow nullable values"));
/* 25 */                return null;
                    }
/* 462 */           if (!z && z2 && obj2 == null) {
/* 477 */               OIiilo1Ool0o.I0010o(oII0I1ii.I00000oOI(), "Argument with type ", " has null value but is not nullable.");
/* 25 */                return null;
                    }
/* 481 */           oI1Oi1.I00000oIO = oII0I1ii;
/* 483 */           oI1Oi1.I00000oOI = z;
/* 485 */           oI1Oi1.I0000O = obj2;
/* 487 */           oI1Oi1.I0000Il00O = z2;
/* 489 */           VarHandle.storeStoreFence();
/* 492 */           OI1Iooo1I oI1Iooo1I = new OI1Iooo1I();
/* 495 */           oI1Iooo1I.I00000oIO = str;
/* 497 */           oI1Iooo1I.I00000oOI = oI1Oi1;
/* 499 */           VarHandle.storeStoreFence();
/* 900 */           return oI1Iooo1I;
                }
            }
