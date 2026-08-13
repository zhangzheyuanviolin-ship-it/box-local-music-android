            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class iioOO0iI1 {
                public static final List I00000oIO(Class cls) {
/* 16 */            return OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I000OiO(cls, I0ollliOo0.I00oOio10iI1), I0ollliOo0.I00ol1, OilOOl1Oo00.I00ioIO));
                }

                public static Ol0IlIlo1lo1 I00000oOI(Type type, O0IiIl0il o0IiIl0il, List list, boolean z) {
/* 6 */             IOolO0l0llil iOolO0l0llil = new IOolO0l0llil(2);
/* 9 */             iOolO0l0llil.I00iiI = type;
/* 11 */            VarHandle.storeStoreFence();
/* 24 */            return new Ol0IlIlo1lo1(o0IiIl0il, list, z, Il01100l.I00iOIl, null, false, false, false, null, iOolO0l0llil);
                }

                public static final O0Ii1IOoiO I0000Il00O(TypeVariable typeVariable) {
/* 1 */             GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
/* 7 */             if (genericDeclaration instanceof Class) {
/* 17 */                return (O0Ii1IOoiO) OOoOl0i.I00000oIO.I00000oOI((Class) genericDeclaration);
                    }
/* 24 */            IOOlIIilOl0.I000OiO("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
/* 27 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final IlOIO00Oi I0000O(Ol0IlIlo1lo1 ol0IlIlo1lo1, Type type) {
/* 1 */             O0IiIl0il o0IiIl0il = ol0IlIlo1lo1.I00iiI;
/* 3 */             List<O0O0o1io> list = ol0IlIlo1lo1.I00iiO;
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 26 */            for (O0O0o1io o0O0o1io : list) {
/* 34 */                O0O01O0o o0O01O0o = o0O0o1io.I00000oOI;
/* 36 */                if (o0O01O0o != null) {
/* 42 */                    o0O0o1io = new O0O0o1io(O0O10O.I00iiO, o0O01O0o);
                        }
/* 45 */                arrayList.add(o0O0o1io);
                    }
/* 50 */            Ol0IlIlo1lo1 ol0IlIlo1lo1I00000oOI = I00000oOI(type, o0IiIl0il, arrayList, true);
/* 57 */            IOolO0l0llil iOolO0l0llil = new IOolO0l0llil(3);
/* 60 */            iOolO0l0llil.I00iiI = type;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            boolean zEquals = ol0IlIlo1lo1.equals(ol0IlIlo1lo1I00000oOI);
                    IlOIO00Oi ilOIO00Oi = ol0IlIlo1lo1;
/* 69 */            if (!zEquals) {
/* 74 */                IlOIO00Oi ilOIO00Oi2 = new IlOIO00Oi(iOolO0l0llil);
/* 77 */                ilOIO00Oi2.I00iiI = ol0IlIlo1lo1;
/* 79 */                ilOIO00Oi2.I00iiO = ol0IlIlo1lo1I00000oOI;
/* 82 */                ilOIO00Oi2.I00iio = false;
/* 84 */                VarHandle.storeStoreFence();
/* 87 */                ilOIO00Oi = ilOIO00Oi2;
                    }
/* 88 */            return ilOIO00Oi;
                }

                /* JADX WARN: Code restructure failed: missing block: B:65:0x0218, code lost:
                
                    r5 = null;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O0O01O0o I0000oI00(Type type, Map map, OoOOOOl ooOOOOl, boolean z, int i) {
                    I011olOoO i011olOoOI00000oOI;
                    ArrayList arrayList;
                    String strI000O01llI0;
/* 5 */             I0ollliOo0 i0ollliOo0 = I0ollliOo0.I00oli;
/* 7 */             I0ollliOo0 i0ollliOo02 = I0ollliOo0.I00olI;
/* 16 */            OoOOOOl ooOOOOl2 = (i & 2) != 0 ? OoOOOOl.I00iiI : ooOOOOl;
/* 25 */            boolean z2 = (i & 4) != 0 ? false : z;
/* 27 */            boolean z3 = type instanceof Class;
/* 32 */            Ill0OI0lo ill0OI0lo = null;
/* 33 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 36 */            if (z3) {
/* 39 */                Class cls = (Class) type;
/* 51 */                if (!I00000oIO(cls).isEmpty() && !z2) {
/* 57 */                    O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(cls);
/* 61 */                    List listI00000oIO = I00000oIO(cls);
/* 73 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 76 */                    Iterator it = listI00000oIO.iterator();
/* 84 */                    while (it.hasNext()) {
/* 112 */                       Type type2 = (Type) I1IoiO1l.I001IO000(((TypeVariable) OilO1oiooiII.I000l1(OilO1oiooiII.I000OiO((TypeVariable) it.next(), I0ollliOo0.I00oO101o))).getBounds());
/* 114 */                       O0O0o1io o0O0o1io = O0O0o1io.I0000Il00O;
/* 124 */                       arrayList2.add(l0iOII0lllIo.I00000oIO(I0000oI00(type2, map, null, true, 2)));
                            }
/* 128 */                   Ol0IlIlo1lo1 ol0IlIlo1lo1I00000oOI = I00000oOI(cls, o0IOli0o0I00000oOI, arrayList2, false);
/* 134 */                   O0IOli0o0 o0IOli0o0I00000oOI2 = OOoOl0i.I00000oIO.I00000oOI(cls);
/* 138 */                   List<TypeVariable> listI00000oIO2 = I00000oIO(cls);
/* 150 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI00000oIO2, 10));
/* 161 */                   for (TypeVariable typeVariable : listI00000oIO2) {
/* 171 */                       arrayList3.add(O0O0o1io.I0000Il00O);
                            }
/* 175 */                   Ol0IlIlo1lo1 ol0IlIlo1lo1I00000oOI2 = I00000oOI(cls, o0IOli0o0I00000oOI2, arrayList3, true);
/* 182 */                   I01iiIii10O i01iiIii10O = new I01iiIii10O(7);
/* 185 */                   i01iiIii10O.I00iiI = cls;
/* 187 */                   VarHandle.storeStoreFence();
/* 194 */                   if (ol0IlIlo1lo1I00000oOI.equals(ol0IlIlo1lo1I00000oOI2)) {
/* 212 */                       return ol0IlIlo1lo1I00000oOI;
                            }
/* 199 */                   IlOIO00Oi ilOIO00Oi = new IlOIO00Oi(i01iiIii10O);
/* 202 */                   ilOIO00Oi.I00iiI = ol0IlIlo1lo1I00000oOI;
/* 204 */                   ilOIO00Oi.I00iiO = ol0IlIlo1lo1I00000oOI2;
/* 206 */                   ilOIO00Oi.I00iio = true;
/* 208 */                   VarHandle.storeStoreFence();
/* 211 */                   return ilOIO00Oi;
                        }
/* 217 */               if (cls.isArray()) {
/* 241 */                   return I0000O(I00000oOI(type, OOoOl0i.I00000oIO.I00000oOI(cls), Collections.singletonList(I0001Ioi1lo(cls.getComponentType(), map)), false), type);
                        }
/* 248 */               O0IOli0o0 o0IOli0o0I00000oOI3 = OOoOl0i.I00000oIO.I00000oOI(cls);
/* 252 */               List<TypeVariable> listI00000oIO3 = I00000oIO(cls);
/* 264 */               ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(listI00000oIO3, 10));
/* 275 */               for (TypeVariable typeVariable2 : listI00000oIO3) {
/* 285 */                   arrayList4.add(O0O0o1io.I0000Il00O);
                        }
/* 289 */               i011olOoOI00000oOI = I00000oOI(type, o0IOli0o0I00000oOI3, arrayList4, false);
                    } else {
/* 297 */               if (type instanceof GenericArrayType) {
/* 306 */                   O0O0o1io o0O0o1ioI0001Ioi1lo = I0001Ioi1lo(((GenericArrayType) type).getGenericComponentType(), map);
/* 318 */                   Class clsI001l0I00 = ((IOIO10iOi1) l0ii0ooi.I00000oOI(o0O0o1ioI0001Ioi1lo.I00000oOI)).I001l0I00();
/* 322 */                   Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 346 */                   return I0000O(I00000oOI(type, OOoOl0i.I00000oIO.I00000oOI(Array.newInstance((Class<?>) clsI001l0I00, 0).getClass()), Collections.singletonList(o0O0o1ioI0001Ioi1lo), false), type);
                        }
/* 353 */               if (type instanceof ParameterizedType) {
/* 356 */                   ParameterizedType parameterizedType = (ParameterizedType) type;
/* 366 */                   O0IOli0o0 o0IOli0o0I00000oOI4 = OOoOl0i.I00000oIO.I00000oOI((Class) parameterizedType.getRawType());
/* 370 */                   if (z2) {
/* 383 */                       List<Type> listI000lI = OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I000OiO(parameterizedType, i0ollliOo02), i0ollliOo0, OilOOii.I00ioIO));
/* 395 */                       arrayList = new ArrayList(IOOi1I.I0000O(listI000lI, 10));
/* 406 */                       for (Type type3 : listI000lI) {
/* 416 */                           arrayList.add(O0O0o1io.I0000Il00O);
                                }
                            } else {
/* 431 */                       List listI000lI2 = OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I000OiO(parameterizedType, i0ollliOo02), i0ollliOo0, OilOOii.I00ioIO));
/* 443 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(listI000lI2, 10));
/* 446 */                       Iterator it2 = listI000lI2.iterator();
/* 454 */                       while (it2.hasNext()) {
/* 466 */                           arrayList5.add(I0001Ioi1lo((Type) it2.next(), map));
                                }
/* 470 */                       arrayList = arrayList5;
                            }
/* 471 */                   i011olOoOI00000oOI = I00000oOI(type, o0IOli0o0I00000oOI4, arrayList, false);
                        } else {
/* 479 */                   if (!(type instanceof TypeVariable)) {
/* 759 */                       if (type instanceof WildcardType) {
/* 763 */                           IoOOl0iOl1io.I001IIilI0O("Wildcard type is not possible here: ", type);
/* 32 */                            return null;
                                }
/* 773 */                       StringBuilder sb = new StringBuilder("Type is not supported: ");
/* 776 */                       sb.append(type);
/* 779 */                       Class<?> cls2 = type.getClass();
/* 785 */                       sb.append(" (");
/* 788 */                       sb.append(cls2);
/* 793 */                       sb.append(')');
/* 966 */                       throw new Ii01OOool(sb.toString());
                            }
/* 482 */                   TypeVariable typeVariable3 = (TypeVariable) type;
/* 488 */                   O0O0OIOO o0o0oioo = (O0O0OIOO) map.get(typeVariable3);
/* 490 */                   if (o0o0oioo == null) {
/* 502 */                       Iterator it3 = I0000Il00O(typeVariable3).getTypeParameters().iterator();
/* 506 */                       boolean z4 = false;
/* 507 */                       Object obj = null;
                                while (true) {
/* 512 */                           if (it3.hasNext()) {
/* 514 */                               Object next = it3.next();
/* 533 */                               if (O0000Ioio00.I0000O(((O0O0OIOO) next).getName(), typeVariable3.getName())) {
/* 535 */                                   if (z4) {
                                                break;
                                            }
/* 539 */                                   obj = next;
/* 540 */                                   z4 = true;
                                        }
                                    } else if (!z4) {
                                        break;
                                    }
                                }
/* 546 */                       o0o0oioo = (O0O0OIOO) obj;
/* 548 */                       if (o0o0oioo == null) {
/* 586 */                           throw new Ii01OOool("Type parameter " + typeVariable3.getName() + " is not found in " + I0000Il00O(typeVariable3));
                                }
                            }
/* 587 */                   i011olOoOI00000oOI = I00000oOI(type, o0o0oioo, il01100l, false);
                        }
                    }
/* 591 */           O0IiIl0il o0IiIl0il = i011olOoOI00000oOI.I00iiI;
/* 601 */           O0IOli0o0 o0IOli0o0 = o0IiIl0il instanceof O0IOli0o0 ? (O0IOli0o0) o0IiIl0il : null;
/* 602 */           String str = O00oO0liO11.I00000oIO;
/* 604 */           if (o0IOli0o0 != null && (strI000O01llI0 = o0IOli0o0.I000O01llI0()) != null) {
/* 614 */               ill0OI0lo = new Ill0OI0lo(strI000O01llI0);
                    }
/* 617 */           Ill0IO ill0IOI000OOo1O = O00oO0liO11.I000OOo1O(ill0OI0lo);
/* 621 */           if (ill0IOI000OOo1O != null && o0IOli0o0 != null) {
/* 625 */               List list = i011olOoOI00000oOI.I00iiO;
/* 627 */               boolean z5 = i011olOoOI00000oOI.I00iio;
/* 629 */               OI0l0000lOo oI0l0000lOoI00000oIO = l1i1iiO0OII.I00000oIO(ill0IOI000OOo1O, o0IOli0o0);
/* 637 */               IOolO0l0llil iOolO0l0llil = new IOolO0l0llil(2);
/* 640 */               iOolO0l0llil.I00iiI = type;
/* 642 */               VarHandle.storeStoreFence();
/* 656 */               Ol0IlIlo1lo1 ol0IlIlo1lo1 = new Ol0IlIlo1lo1(o0IiIl0il, list, z5, il01100l, null, false, false, false, oI0l0000lOoI00000oIO, iOolO0l0llil);
/* 661 */               IOolO0l0llil iOolO0l0llil2 = new IOolO0l0llil(0);
/* 664 */               iOolO0l0llil2.I00iiI = type;
/* 666 */               VarHandle.storeStoreFence();
/* 673 */               if (ol0IlIlo1lo1.equals(i011olOoOI00000oOI)) {
/* 675 */                   i011olOoOI00000oOI = ol0IlIlo1lo1;
                        } else {
/* 679 */                   IlOIO00Oi ilOIO00Oi2 = new IlOIO00Oi(iOolO0l0llil2);
/* 682 */                   ilOIO00Oi2.I00iiI = ol0IlIlo1lo1;
/* 684 */                   ilOIO00Oi2.I00iiO = i011olOoOI00000oOI;
/* 686 */                   ilOIO00Oi2.I00iio = false;
/* 688 */                   VarHandle.storeStoreFence();
/* 691 */                   i011olOoOI00000oOI = ilOIO00Oi2;
                        }
                    }
/* 692 */           int iOrdinal = ooOOOOl2.ordinal();
/* 696 */           if (iOrdinal == 0) {
/* 756 */               return i011olOoOI00000oOI;
                    }
/* 698 */           if (iOrdinal == 1) {
/* 751 */               return i011olOoOI00000oOI.I001lllioOl(true);
                    }
/* 700 */           I011olOoO i011olOoOI001l0I00 = i011olOoOI00000oOI.I001l0I00();
/* 704 */           if (i011olOoOI001l0I00 == null) {
/* 706 */               i011olOoOI001l0I00 = i011olOoOI00000oOI;
                    }
/* 707 */           I011olOoO i011olOoOI001lloI = i011olOoOI00000oOI.I001lloI();
/* 711 */           if (i011olOoOI001lloI != null) {
/* 714 */               i011olOoOI00000oOI = i011olOoOI001lloI;
                    }
/* 715 */           I011olOoO i011olOoOI001lllioOl = i011olOoOI00000oOI.I001lllioOl(true);
/* 721 */           IOolO0l0llil iOolO0l0llil3 = new IOolO0l0llil(1);
/* 724 */           iOolO0l0llil3.I00iiI = type;
/* 726 */           VarHandle.storeStoreFence();
/* 733 */           if (i011olOoOI001l0I00.equals(i011olOoOI001lllioOl)) {
/* 735 */               return i011olOoOI001l0I00;
                    }
/* 738 */           IlOIO00Oi ilOIO00Oi3 = new IlOIO00Oi(iOolO0l0llil3);
/* 741 */           ilOIO00Oi3.I00iiI = i011olOoOI001l0I00;
/* 743 */           ilOIO00Oi3.I00iiO = i011olOoOI001lllioOl;
/* 745 */           ilOIO00Oi3.I00iio = false;
/* 747 */           VarHandle.storeStoreFence();
/* 750 */           return ilOIO00Oi3;
                }

                public static final O0O0o1io I0001Ioi1lo(Type type, Map map) {
/* 6 */             if (!(type instanceof WildcardType)) {
/* 8 */                 O0O0o1io o0O0o1io = O0O0o1io.I0000Il00O;
/* 14 */                return l0iOII0lllIo.I00000oIO(I0000oI00(type, map, null, false, 6));
                    }
/* 20 */            WildcardType wildcardType = (WildcardType) type;
/* 22 */            Type[] upperBounds = wildcardType.getUpperBounds();
/* 26 */            Type[] lowerBounds = wildcardType.getLowerBounds();
/* 32 */            if (upperBounds.length > 1 || lowerBounds.length > 1) {
/* 88 */                IoOOl0iOl1io.I001IIilI0O("Wildcard types with many bounds are not supported: ", type);
/* 5 */                 return null;
                    }
/* 38 */            if (lowerBounds.length == 1) {
/* 40 */                O0O0o1io o0O0o1io2 = O0O0o1io.I0000Il00O;
/* 56 */                return new O0O0o1io(O0O10O.I00iiI, I0000oI00((Type) I1IoiO1l.I00II0oii1o(lowerBounds), map, null, false, 6));
                    }
/* 61 */            if (upperBounds.length != 1) {
/* 83 */                return O0O0o1io.I0000Il00O;
                    }
/* 63 */            O0O0o1io o0O0o1io3 = O0O0o1io.I0000Il00O;
/* 79 */            return new O0O0o1io(O0O10O.I00iiO, I0000oI00((Type) I1IoiO1l.I00II0oii1o(upperBounds), map, null, false, 6));
                }
            }
