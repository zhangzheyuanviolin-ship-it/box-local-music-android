            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function3;
            
/* 13 */    public final class IoIlii1 extends Oll0io implements Function3 {
                public final int I00iOIl = 2;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIlii1(Long l, Long l2, Long l3, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(3, iOoil1iiIilo);
/* 4 */             this.I00ilI0I1 = l;
/* 6 */             this.I00ilO0 = l2;
/* 8 */             this.I00io1l = l3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 75 */                    IoIlii1 ioIlii1 = new IoIlii1((IoIlI1oli) this.I00ilO0, (I0lOIOI11OIl) this.I00io1l, (IOoil1iiIilo) obj3);
/* 78 */                    ioIlii1.I00iio = (OO11OoloI) obj;
/* 80 */                    ioIlii1.I00ilI0I1 = obj2;
/* 82 */                    return ioIlii1.invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 49 */                    IoIlii1 ioIlii12 = new IoIlii1((Long) this.I00ilI0I1, (Long) this.I00ilO0, (Long) this.I00io1l, (IOoil1iiIilo) obj3);
/* 52 */                    ioIlii12.I00iiO = (Oil11Ii) obj;
/* 54 */                    ioIlii12.I00iio = (IoO10oI0o) obj2;
/* 56 */                    return ioIlii12.invokeSuspend(ooiIlOl1iI);
                        default:
/* 17 */                    IoIlii1 ioIlii13 = new IoIlii1(3, (IOoil1iiIilo) obj3);
/* 20 */                    ioIlii13.I00iio = (OO11OoloI) obj;
/* 22 */                    ioIlii13.I00io1l = (IoO1o1) obj2;
/* 24 */                    return ioIlii13.invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
                
                    if (r0 == r9) goto L38;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:149:0x03fd  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x0401  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x0404  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x0425  */
                /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:85:0x024f  */
                /* JADX WARN: Type inference failed for: r3v36, types: [IOO01l00ol] */
                /* JADX WARN: Type inference failed for: r5v2, types: [Il01llIol0] */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v9, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O0O01O0o o0O01O0oI00000oIO;
                    IOiOol0 iOiOol0;
                    Set setKeySet;
                    Object objI000II;
                    O0O01O0o o0O01O0oI00000oIO2;
                    IoIlIolo10o ioIlIolo10o;
                    boolean z;
                    IIIoloiiI1 iIIoloiiI1;
                    IOoil1iiIilo iOoil1iiIilo;
                    Object obj2;
                    OoOO010 ooOO010;
                    Ii1olII1lO1 ii1olII1lO1;
                    IOO01l iOO01l;
                    Object objI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             boolean z2 = false;
                    switch (i) {
                        case 0:
/* 611 */                   I0lOIOI11OIl i0lOIOI11OIl = (I0lOIOI11OIl) this.I00io1l;
/* 615 */                   IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I00ilO0;
/* 617 */                   I0IIiO0iI i0IIiO0iI = ioIlI1oli.I00l0I0l0lO1;
/* 621 */                   OO11OoloI oO11OoloI = (OO11OoloI) this.I00iio;
/* 623 */                   Object obj3 = this.I00ilI0I1;
/* 625 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 627 */                   int i2 = this.I00iiI;
/* 629 */                   if (i2 == 0) {
/* 658 */                       lIoii1l01l0i.I00000oOI(obj);
/* 663 */                       IoO10oI0o ioO10oI0o = new IoO10oI0o();
/* 668 */                       IoO10oI0o ioO10oI0o2 = (IoO10oI0o) oO11OoloI.I00iOIl;
/* 672 */                       ioO10oI0o.I0000oI00 = ioO10oI0o2.I0000oI00;
/* 674 */                       ioO10oI0o.I00000oOI(ioO10oI0o2);
/* 679 */                       if (obj3 == null) {
/* 683 */                           ioO10oI0o.I0000O = OIOIIioi.I00000oIO;
/* 687 */                           O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(Object.class);
                                    try {
/* 691 */                               o0O01O0oI00000oIO2 = OOoOl0i.I00000oIO(Object.class);
                                    } catch (Throwable unused) {
/* 696 */                               o0O01O0oI00000oIO2 = null;
                                    }
/* 702 */                           ioO10oI0o.I00000oIO(new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO2));
                                } else if (obj3 instanceof OIio0oloI1I) {
/* 710 */                           ioO10oI0o.I0000O = obj3;
/* 712 */                           ioO10oI0o.I00000oIO(null);
                                } else {
/* 716 */                           ioO10oI0o.I0000O = obj3;
/* 720 */                           O0IOli0o0 o0IOli0o0I00000oOI2 = OOoOl0i.I00000oIO.I00000oOI(Object.class);
                                    try {
/* 724 */                               o0O01O0oI00000oIO = OOoOl0i.I00000oIO(Object.class);
                                    } catch (Throwable unused2) {
/* 729 */                               o0O01O0oI00000oIO = null;
                                    }
/* 735 */                           ioO10oI0o.I00000oIO(new OoOO010(o0IOli0o0I00000oOI2, o0O01O0oI00000oIO));
                                }
/* 740 */                       i0IIiO0iI.I00100o1O0lo(IOIoi11o.I00000oOI);
/* 747 */                       Ool0oO1OIi ool0oO1OIiI00000oOI = ioO10oI0o.I00000oIO.I00000oOI();
/* 751 */                       IoIolIO1 ioIolIO1 = ioO10oI0o.I00000oOI;
/* 761 */                       Io1OIO1 io1OIO1 = new Io1OIO1((Map) ioO10oI0o.I0000Il00O.I00iOIl, true);
/* 764 */                       Object obj4 = ioO10oI0o.I0000O;
/* 773 */                       OIio0oloI1I oIio0oloI1I = obj4 instanceof OIio0oloI1I ? (OIio0oloI1I) obj4 : null;
/* 774 */                       if (oIio0oloI1I != null) {
/* 776 */                           Oliiii0 oliiii0 = ioO10oI0o.I0000oI00;
/* 779 */                           iOiOol0 = new IOiOol0(6);
/* 782 */                           iOiOol0.I00iiI = ool0oO1OIiI00000oOI;
/* 784 */                           iOiOol0.I00iiO = ioIolIO1;
/* 786 */                           iOiOol0.I00iio = io1OIO1;
/* 788 */                           iOiOol0.I00ilI0I1 = oIio0oloI1I;
/* 790 */                           iOiOol0.I00ilO0 = oliiii0;
/* 792 */                           IOlOl10 iOlOl10 = ioO10oI0o.I0001Ioi1lo;
/* 794 */                           iOiOol0.I00io1l = iOlOl10;
/* 802 */                           Map map = (Map) iOlOl10.I0000O(IoIloO1OOO.I00000oIO);
/* 804 */                           ?? linkedHashSet = Il01llIol0.I00iOIl;
/* 806 */                           if (map == null || (setKeySet = map.keySet()) == null) {
/* 814 */                               setKeySet = linkedHashSet;
                                    }
/* 815 */                           iOiOol0.I00ioIO = setKeySet;
/* 817 */                           VarHandle.storeStoreFence();
/* 824 */                           iOlOl10.I0000oI00(IoIo0oIIl101.I00000oOI, ioIlI1oli.I00l0OO0IO);
/* 827 */                           int i3 = io1OIO1.I0001Ioi1lo;
/* 829 */                           if (i3 != 0) {
/* 834 */                               linkedHashSet = new LinkedHashSet();
/* 838 */                               for (int i4 = 0; i4 < i3; i4++) {
/* 844 */                                   linkedHashSet.add(io1OIO1.I0000O[i4]);
                                        }
                                    }
/* 854 */                           ArrayList arrayList = new ArrayList();
/* 865 */                           for (Object obj5 : (Iterable) linkedHashSet) {
/* 880 */                               if (IoIoIollo0O.I00000oIO.contains((String) obj5)) {
/* 882 */                                   arrayList.add(obj5);
                                        }
                                    }
/* 890 */                           if (!arrayList.isEmpty()) {
/* 1135 */                              throw new IoOoiol010lI(IlIi0I0.I000lI("Header(s) ", arrayList.toString(), " are controlled by the engine and cannot be set explicitly"));
                                    }
/* 904 */                           for (IoIlloI ioIlloI : (Set) iOiOol0.I00ioIO) {
/* 918 */                               if (!i0lOIOI11OIl.I00ilO0.contains(ioIlloI)) {
/* 923 */                                   OIiilo1Ool0o.I000O01llI0("Engine doesn't support ", ioIlloI);
                                        }
                                    }
/* 928 */                           this.I00iio = oO11OoloI;
/* 930 */                           this.I00ilI0I1 = null;
/* 932 */                           this.I00iiO = iOiOol0;
/* 935 */                           this.I00iiI = 1;
/* 937 */                           objI000II = i0lOIOI11OIl.I000II(iOiOol0, this);
/* 941 */                           if (objI000II != ii0111o) {
/* 945 */                               IoO1ollo10 ioO1ollo10 = (IoO1ollo10) objI000II;
/* 949 */                               ioIlIolo10o = new IoIlIolo10o(ioIlI1oli);
/* 954 */                               Ii1ol0o1OO0o ii1ol0o1OO0o = new Ii1ol0o1OO0o();
/* 957 */                               ii1ol0o1OO0o.I00iOIl = ioIlIolo10o;
/* 963 */                               ii1ol0o1OO0o.I00iiI = (IoIolIO1) iOiOol0.I00iiO;
/* 969 */                               ii1ol0o1OO0o.I00iiO = (Ool0oO1OIi) iOiOol0.I00iiI;
/* 975 */                               ii1ol0o1OO0o.I00iio = (Io1OIO1) iOiOol0.I00iio;
/* 981 */                               ii1ol0o1OO0o.I00ilI0I1 = (IOlOl10) iOiOol0.I00io1l;
/* 983 */                               VarHandle.storeStoreFence();
/* 986 */                               ioIlIolo10o.I00iiI = ii1ol0o1OO0o;
/* 991 */                               Ii1olII1lO1 ii1olII1lO12 = new Ii1olII1lO1(0);
/* 994 */                               ii1olII1lO12.I00io1l = ioIlIolo10o;
/* 998 */                               ii1olII1lO12.I00ilO0 = ioO1ollo10.I0000oI00;
/* 1002 */                              ii1olII1lO12.I00iiI = ioO1ollo10.I00000oIO;
/* 1006 */                              ii1olII1lO12.I00iiO = IoO0ii1I.I00000oIO;
/* 1010 */                              ii1olII1lO12.I00iio = ioO1ollo10.I00000oOI;
/* 1014 */                              ii1olII1lO12.I00ilI0I1 = ioO1ollo10.I0001Ioi1lo;
/* 1016 */                              Object obj6 = ioO1ollo10.I0000O;
/* 1018 */                              z = obj6 instanceof IIIoloiiI1;
/* 1026 */                              if (!z) {
                                        }
/* 1027 */                              if (iIIoloiiI1 == null) {
                                        }
/* 1036 */                              ii1olII1lO12.I00ioIO = iIIoloiiI1;
/* 1040 */                              ii1olII1lO12.I00l0I0l0lO1 = ioO1ollo10.I0000Il00O;
/* 1042 */                              VarHandle.storeStoreFence();
/* 1045 */                              ioIlIolo10o.I00iiO = ii1olII1lO12;
/* 1047 */                              IOlOl10 attributes = ioIlIolo10o.getAttributes();
/* 1051 */                              I1OoollI1Il1 i1OoollI1Il1 = IoIlIolo10o.I00ilI0I1;
/* 1057 */                              attributes.I0000Il00O().remove(i1OoollI1Il1);
/* 1060 */                              if (!z) {
                                        }
/* 1069 */                              Ii1olII1lO1 ii1olII1lO1I0000oI00 = ioIlIolo10o.I0000oI00();
/* 1075 */                              i0IIiO0iI.I00100o1O0lo(IOIoi11o.I0000Il00O);
/* 1082 */                              O010OIi o010OIiI0000oI00 = l01oO1iOo.I0000oI00(ii1olII1lO1I0000oI00.I00000oIO());
/* 1090 */                              Iil1olo iil1olo = new Iil1olo(23);
/* 1093 */                              iil1olo.I00iiI = ioIlI1oli;
/* 1095 */                              VarHandle.storeStoreFence();
/* 1098 */                              o010OIiI0000oI00.I00iiI(iil1olo);
/* 1101 */                              this.I00iio = null;
/* 1103 */                              this.I00ilI0I1 = null;
/* 1105 */                              this.I00iiO = null;
/* 1108 */                              this.I00iiI = 2;
/* 1114 */                              if (oO11OoloI.I0000oI00(this, ioIlIolo10o) != ii0111o) {
                                        }
                                    }
                                } else {
/* 1140 */                          OIiilo1Ool0o.I00100l0("No request transformation found: ", ioO10oI0o.I0000O);
                                }
/* 12 */                        return null;
                            }
/* 631 */                   if (i2 != 1) {
/* 633 */                       if (i2 == 2) {
/* 635 */                           lIoii1l01l0i.I00000oOI(obj);
/* 1145 */                          return ooiIlOl1iI;
                                }
/* 640 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 648 */                   IOiOol0 iOiOol02 = (IOiOol0) this.I00iiO;
/* 650 */                   lIoii1l01l0i.I00000oOI(obj);
/* 653 */                   iOiOol0 = iOiOol02;
/* 654 */                   objI000II = obj;
/* 945 */                   IoO1ollo10 ioO1ollo102 = (IoO1ollo10) objI000II;
/* 949 */                   ioIlIolo10o = new IoIlIolo10o(ioIlI1oli);
/* 954 */                   Ii1ol0o1OO0o ii1ol0o1OO0o2 = new Ii1ol0o1OO0o();
/* 957 */                   ii1ol0o1OO0o2.I00iOIl = ioIlIolo10o;
/* 963 */                   ii1ol0o1OO0o2.I00iiI = (IoIolIO1) iOiOol0.I00iiO;
/* 969 */                   ii1ol0o1OO0o2.I00iiO = (Ool0oO1OIi) iOiOol0.I00iiI;
/* 975 */                   ii1ol0o1OO0o2.I00iio = (Io1OIO1) iOiOol0.I00iio;
/* 981 */                   ii1ol0o1OO0o2.I00ilI0I1 = (IOlOl10) iOiOol0.I00io1l;
/* 983 */                   VarHandle.storeStoreFence();
/* 986 */                   ioIlIolo10o.I00iiI = ii1ol0o1OO0o2;
/* 991 */                   Ii1olII1lO1 ii1olII1lO122 = new Ii1olII1lO1(0);
/* 994 */                   ii1olII1lO122.I00io1l = ioIlIolo10o;
/* 998 */                   ii1olII1lO122.I00ilO0 = ioO1ollo102.I0000oI00;
/* 1002 */                  ii1olII1lO122.I00iiI = ioO1ollo102.I00000oIO;
/* 1006 */                  ii1olII1lO122.I00iiO = IoO0ii1I.I00000oIO;
/* 1010 */                  ii1olII1lO122.I00iio = ioO1ollo102.I00000oOI;
/* 1014 */                  ii1olII1lO122.I00ilI0I1 = ioO1ollo102.I0001Ioi1lo;
/* 1016 */                  Object obj62 = ioO1ollo102.I0000O;
/* 1018 */                  z = obj62 instanceof IIIoloiiI1;
/* 1026 */                  iIIoloiiI1 = !z ? (IIIoloiiI1) obj62 : null;
/* 1027 */                  if (iIIoloiiI1 == null) {
/* 1031 */                      IIIoloiiI1.I00000oIO.getClass();
/* 1034 */                      iIIoloiiI1 = IIIolloil.I00000oOI;
                            }
/* 1036 */                  ii1olII1lO122.I00ioIO = iIIoloiiI1;
/* 1040 */                  ii1olII1lO122.I00l0I0l0lO1 = ioO1ollo102.I0000Il00O;
/* 1042 */                  VarHandle.storeStoreFence();
/* 1045 */                  ioIlIolo10o.I00iiO = ii1olII1lO122;
/* 1047 */                  IOlOl10 attributes2 = ioIlIolo10o.getAttributes();
/* 1051 */                  I1OoollI1Il1 i1OoollI1Il12 = IoIlIolo10o.I00ilI0I1;
/* 1057 */                  attributes2.I0000Il00O().remove(i1OoollI1Il12);
/* 1060 */                  if (!z) {
/* 1066 */                      ioIlIolo10o.getAttributes().I0000oI00(i1OoollI1Il12, obj62);
                            }
/* 1069 */                  Ii1olII1lO1 ii1olII1lO1I0000oI002 = ioIlIolo10o.I0000oI00();
/* 1075 */                  i0IIiO0iI.I00100o1O0lo(IOIoi11o.I0000Il00O);
/* 1082 */                  O010OIi o010OIiI0000oI002 = l01oO1iOo.I0000oI00(ii1olII1lO1I0000oI002.I00000oIO());
/* 1090 */                  Iil1olo iil1olo2 = new Iil1olo(23);
/* 1093 */                  iil1olo2.I00iiI = ioIlI1oli;
/* 1095 */                  VarHandle.storeStoreFence();
/* 1098 */                  o010OIiI0000oI002.I00iiI(iil1olo2);
/* 1101 */                  this.I00iio = null;
/* 1103 */                  this.I00ilI0I1 = null;
/* 1105 */                  this.I00iiO = null;
/* 1108 */                  this.I00iiI = 2;
/* 1114 */                  if (oO11OoloI.I0000oI00(this, ioIlIolo10o) != ii0111o) {
/* 1145 */                      return ooiIlOl1iI;
                            }
/* 1116 */                  return ii0111o;
                        case 1:
/* 369 */                   Long l = (Long) this.I00io1l;
/* 373 */                   Long l2 = (Long) this.I00ilO0;
/* 377 */                   Long l3 = (Long) this.I00ilI0I1;
/* 381 */                   Oil11Ii oil11Ii = (Oil11Ii) this.I00iiO;
/* 386 */                   IoO10oI0o ioO10oI0o3 = (IoO10oI0o) this.I00iio;
/* 388 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 390 */                   int i5 = this.I00iiI;
/* 392 */                   if (i5 != 0) {
/* 394 */                       if (i5 == 1) {
/* 396 */                           lIoii1l01l0i.I00000oOI(obj);
/* 399 */                           return obj;
                                }
/* 403 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 409 */                   lIoii1l01l0i.I00000oOI(obj);
/* 412 */                   O1I1OOiol o1I1OOiol = IoOOIiIl00.I00000oIO;
/* 414 */                   Ooi11l0lI ooi11l0lI = ioO10oI0o3.I00000oIO;
/* 416 */                   IOlOl10 iOlOl102 = ioO10oI0o3.I0001Ioi1lo;
/* 422 */                   String str = ooi11l0lI.I0000O().I00iOIl;
/* 430 */                   if (!str.equals("ws") && !str.equals("wss") && !(ioO10oI0o3.I0000O instanceof OiIIoIIIii)) {
/* 447 */                       z2 = true;
                            }
/* 448 */                   I1OoollI1Il1 i1OoollI1Il13 = IoIloO1OOO.I00000oIO;
/* 454 */                   Map map2 = (Map) iOlOl102.I0000O(i1OoollI1Il13);
/* 456 */                   IoOO1000I ioOO1000I = IoOO1000I.I00000oIO;
/* 466 */                   IoOOIO ioOOIO = (IoOOIO) (map2 != null ? map2.get(ioOO1000I) : null);
/* 468 */                   if (ioOOIO == null && ((z2 && l3 != null) || l2 != null || l != null)) {
/* 480 */                       ioOOIO = new IoOOIO();
/* 496 */                       ((Map) iOlOl102.I00000oIO(i1OoollI1Il13, new Iloi111(9))).put(ioOO1000I, ioOOIO);
                            }
/* 499 */                   if (ioOOIO == null) {
/* 592 */                       iOoil1iiIilo = null;
                            } else {
/* 501 */                       Long l4 = ioOOIO.I00000oOI;
/* 503 */                       if (l4 != null) {
/* 506 */                           l2 = l4;
                                }
/* 507 */                       IoOOIO.I00000oIO(l2);
/* 510 */                       ioOOIO.I00000oOI = l2;
/* 512 */                       Long l5 = ioOOIO.I0000Il00O;
/* 514 */                       if (l5 != null) {
/* 517 */                           l = l5;
                                }
/* 518 */                       IoOOIO.I00000oIO(l);
/* 521 */                       ioOOIO.I0000Il00O = l;
/* 523 */                       if (z2) {
/* 525 */                           Long l6 = ioOOIO.I00000oIO;
/* 531 */                           Long l7 = l6 == null ? l3 : l6;
/* 532 */                           IoOOIO.I00000oIO(l7);
/* 535 */                           ioOOIO.I00000oIO = l7;
/* 537 */                           if (l7 != null && l7.longValue() != Long.MAX_VALUE) {
/* 566 */                               iOoil1iiIilo = null;
/* 570 */                               OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(oil11Ii, new Ii00oll("request-timeout"), null, new IiI110i1O(l7, ioO10oI0o3, ioO10oI0o3.I0000oI00, iOoil1iiIilo, 14), 2);
/* 574 */                               Oliiii0 oliiii02 = ioO10oI0o3.I0000oI00;
/* 580 */                               Iil1olo iil1olo3 = new Iil1olo(27);
/* 583 */                               iil1olo3.I00iiI = olIl0iI0000O;
/* 585 */                               VarHandle.storeStoreFence();
/* 588 */                               oliiii02.I00iiI(iil1olo3);
                                    }
                                }
                            }
/* 593 */                   this.I00iiO = iOoil1iiIilo;
/* 595 */                   this.I00iio = iOoil1iiIilo;
/* 597 */                   this.I00iiI = 1;
/* 601 */                   Object objI00000oIO = oil11Ii.I00iOIl.I00000oIO(ioO10oI0o3, this);
                            return objI00000oIO == ii0111o2 ? ii0111o2 : objI00000oIO;
                        default:
/* 18 */                    OO11OoloI oO11OoloI2 = (OO11OoloI) this.I00iio;
/* 22 */                    IoO1o1 ioO1o1 = (IoO1o1) this.I00io1l;
/* 24 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 26 */                    int i6 = this.I00iiI;
/* 29 */                    if (i6 == 0) {
/* 72 */                        lIoii1l01l0i.I00000oOI(obj);
/* 75 */                        OoOO010 ooOO0102 = ioO1o1.I00000oIO;
/* 77 */                        Object obj7 = ioO1o1.I00000oOI;
/* 83 */                        Ii1olII1lO1 ii1olII1lO1I0000oI003 = ((IoIlIolo10o) oO11OoloI2.I00iOIl).I0000oI00();
/* 107 */                       if (!O0000Ioio00.I0000O(io0OoioI0O1.I0000Il00O(ii1olII1lO1I0000oI003).getAttributes().I0000O(IIIO11i.I00000oIO), Boolean.TRUE)) {
/* 109 */                           O1I1OOiol o1I1OOiol2 = OiIOOIOIo.I00000oIO;
/* 115 */                           if (!o1I1OOiol2.I000II()) {
/* 366 */                               return ooiIlOl1iI;
                                    }
/* 139 */                           o1I1OOiol2.I000o00OoI0I("Skipping non SSE response from " + io0OoioI0O1.I0000Il00O(ii1olII1lO1I0000oI003).getUrl());
/* 366 */                           return ooiIlOl1iI;
                                }
/* 144 */                       this.I00iio = oO11OoloI2;
/* 146 */                       this.I00io1l = null;
/* 148 */                       this.I00iiO = ooOO0102;
/* 150 */                       this.I00ilI0I1 = obj7;
/* 152 */                       this.I00ilO0 = ii1olII1lO1I0000oI003;
/* 154 */                       this.I00iiI = 1;
/* 160 */                       if (OiIOOIOIo.I00000oIO(ii1olII1lO1I0000oI003, this) != ii0111o3) {
/* 164 */                           obj2 = obj7;
/* 165 */                           ooOO010 = ooOO0102;
/* 166 */                           ii1olII1lO1 = ii1olII1lO1I0000oI003;
                                }
/* 365 */                       return ii0111o3;
                            }
/* 31 */                    if (i6 != 1) {
/* 33 */                        if (i6 != 2) {
/* 35 */                            if (i6 == 3) {
/* 37 */                                lIoii1l01l0i.I00000oOI(obj);
/* 366 */                               return ooiIlOl1iI;
                                    }
/* 42 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 48 */                        Object obj8 = this.I00ilI0I1;
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        obj2 = obj8;
/* 54 */                        objI00000oOI = obj;
/* 232 */                       throw new OiIIoOll0Il((Ii1olII1lO1) objI00000oOI, null, "Expected " + OOoOl0i.I00000oIO.I00000oOI(OiIOOO0.class).I000oI1ioi() + " content but was " + obj2, 2);
                            }
/* 60 */                    ii1olII1lO1 = (Ii1olII1lO1) this.I00ilO0;
/* 62 */                    obj2 = this.I00ilI0I1;
/* 66 */                    ooOO010 = (OoOO010) this.I00iiO;
/* 68 */                    lIoii1l01l0i.I00000oOI(obj);
/* 169 */                   if (!(obj2 instanceof OiIOOO0)) {
/* 171 */                       this.I00iio = null;
/* 173 */                       this.I00io1l = null;
/* 175 */                       this.I00iiO = null;
/* 177 */                       this.I00ilI0I1 = obj2;
/* 179 */                       this.I00ilO0 = null;
/* 181 */                       this.I00iiI = 2;
/* 183 */                       objI00000oOI = OiIOOIOIo.I00000oOI(ii1olII1lO1, this);
                                break;
                            } else {
/* 233 */                       O1I1OOiol o1I1OOiol3 = OiIOOIOIo.I00000oIO;
/* 239 */                       if (o1I1OOiol3.I000II()) {
/* 271 */                           o1I1OOiol3.I000o00OoI0I("Receive SSE session from " + io0OoioI0O1.I0000Il00O(ii1olII1lO1).getUrl() + ": " + obj2);
                                }
/* 290 */                       if (((IlliIl1l11O) io0OoioI0O1.I0000Il00O(ii1olII1lO1).getAttributes().I0000O(IIIO11i.I0000oI00)) != null) {
/* 300 */                           IIOlO1ii iIOlO1ii = new IIOlO1ii(2);
/* 303 */                           OiIOOO0 oiIOOO0 = (OiIOOO0) obj2;
/* 305 */                           oiIOOO0.I000l1();
/* 312 */                           iIOlO1ii.I00iiI = oiIOOO0.I00000oIO();
/* 314 */                           VarHandle.storeStoreFence();
/* 317 */                           ?? iOO01l00ol = new IOO01l00ol(0);
/* 320 */                           iOO01l00ol.I00iiI = iIOlO1ii;
/* 322 */                           VarHandle.storeStoreFence();
                                    iOO01l = iOO01l00ol;
                                } else {
/* 334 */                           IOO01l iOO01l2 = new IOO01l();
/* 337 */                           iOO01l2.I00iOIl = (OiIOOO0) obj2;
/* 339 */                           VarHandle.storeStoreFence();
                                    iOO01l = iOO01l2;
                                }
/* 344 */                       IoO1o1 ioO1o12 = new IoO1o1(ooOO010, iOO01l);
/* 347 */                       this.I00iio = null;
/* 349 */                       this.I00io1l = null;
/* 351 */                       this.I00iiO = null;
/* 353 */                       this.I00ilI0I1 = null;
/* 355 */                       this.I00ilO0 = null;
/* 357 */                       this.I00iiI = 3;
/* 363 */                       if (oO11OoloI2.I0000oI00(this, ioO1o12) != ii0111o3) {
/* 366 */                           return ooiIlOl1iI;
                                }
                            }
/* 365 */                   return ii0111o3;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public IoIlii1(IoIlI1oli ioIlI1oli, I0lOIOI11OIl i0lOIOI11OIl, IOoil1iiIilo iOoil1iiIilo) {
                    super(3, iOoil1iiIilo);
/* 15 */            this.I00ilO0 = ioIlI1oli;
                    this.I00io1l = i0lOIOI11OIl;
                }

/* 15 */        public IoIlii1(int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(i, iOoil1iiIilo);
                }
            }
