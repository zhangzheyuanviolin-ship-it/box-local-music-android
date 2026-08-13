            package p000;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class Il11i0lOl extends OoO00O1IiOl {
                public volatile OoO00O1IiOl I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public OoIlIoo1oiOo I0000O;
                public OoOilO I0000oI00;
                public Il11i1 I0001Ioi1lo;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    Iterator it;
/* 4 */             if (this.I00000oOI) {
/* 6 */                 o01loll1loll.I00oooO();
/* 3 */                 return null;
                    }
/* 10 */            OoO00O1IiOl ooO00O1IiOlI0000O = this.I00000oIO;
/* 12 */            if (ooO00O1IiOlI0000O == null) {
/* 14 */                OoIlIoo1oiOo ooIlIoo1oiOo = this.I0000O;
/* 16 */                Il11i1 il11i1 = this.I0001Ioi1lo;
/* 18 */                OoOilO ooOilO = this.I0000oI00;
/* 22 */                O011oOIoO00O o011oOIoO00O = (O011oOIoO00O) ooIlIoo1oiOo.I00ilO0;
/* 24 */                o011oOIoO00O.getClass();
/* 27 */                ConcurrentHashMap concurrentHashMap = o011oOIoO00O.I00iiI;
/* 32 */                if (il11i1 == O011oOIoO00O.I00iiO) {
/* 100 */                   il11i1 = o011oOIoO00O;
/* 105 */                   it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 109 */                   boolean z = false;
                            while (true) {
/* 114 */                       if (it.hasNext()) {
/* 120 */                           OoO00iO0OOl0 ooO00iO0OOl0 = (OoO00iO0OOl0) it.next();
/* 122 */                           if (z) {
/* 128 */                               OoO00O1IiOl ooO00O1IiOlI00000oIO = ooO00iO0OOl0.I00000oIO(ooIlIoo1oiOo, ooOilO);
/* 132 */                               if (ooO00O1IiOlI00000oIO != null) {
/* 134 */                                   ooO00O1IiOlI0000O = ooO00O1IiOlI00000oIO;
                                            break;
                                        }
                                    } else if (ooO00iO0OOl0 == il11i1) {
/* 126 */                               z = true;
                                    }
                                } else {
/* 136 */                           if (z) {
/* 147 */                               IioIoO10iOiI.I000OiO("GSON cannot serialize or deserialize ", ooOilO);
/* 3 */                                 return null;
                                    }
/* 138 */                           ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(ooOilO);
                                }
                            }
/* 142 */                   this.I00000oIO = ooO00O1IiOlI0000O;
                        } else {
/* 35 */                    Class cls = ooOilO.I00000oIO;
/* 41 */                    OoO00iO0OOl0 ooO00iO0OOl02 = (OoO00iO0OOl0) concurrentHashMap.get(cls);
/* 43 */                    if (ooO00iO0OOl02 != null) {
/* 45 */                        if (ooO00iO0OOl02 == il11i1) {
                                }
/* 105 */                       it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 109 */                       boolean z2 = false;
                                while (true) {
/* 114 */                           if (it.hasNext()) {
                                    }
                                }
/* 142 */                       this.I00000oIO = ooO00O1IiOlI0000O;
                            } else {
/* 54 */                        O011liOil o011liOil = (O011liOil) cls.getAnnotation(O011liOil.class);
/* 56 */                        if (o011liOil != null) {
/* 59 */                            Class clsValue = o011liOil.value();
/* 69 */                            if (OoO00iO0OOl0.class.isAssignableFrom(clsValue)) {
/* 87 */                                OoO00iO0OOl0 ooO00iO0OOl03 = (OoO00iO0OOl0) o011oOIoO00O.I00iOIl.I00o0l1o1o0(new OoOilO(clsValue), true).I00000oOI();
/* 93 */                                OoO00iO0OOl0 ooO00iO0OOl04 = (OoO00iO0OOl0) concurrentHashMap.putIfAbsent(cls, ooO00iO0OOl03);
/* 95 */                                if (ooO00iO0OOl04 != null) {
/* 97 */                                    ooO00iO0OOl03 = ooO00iO0OOl04;
                                        }
/* 98 */                                if (ooO00iO0OOl03 == il11i1) {
                                        }
                                    }
                                }
/* 105 */                       it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 109 */                       boolean z22 = false;
                                while (true) {
/* 114 */                           if (it.hasNext()) {
                                    }
                                }
/* 142 */                       this.I00000oIO = ooO00O1IiOlI0000O;
                            }
                        }
                    }
/* 151 */           return ooO00O1IiOlI0000O.I00000oOI(o01loll1loll);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    Iterator it;
/* 3 */             if (this.I0000Il00O) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
/* 8 */                 return;
                    }
/* 9 */             OoO00O1IiOl ooO00O1IiOlI0000O = this.I00000oIO;
/* 11 */            if (ooO00O1IiOlI0000O == null) {
/* 13 */                OoIlIoo1oiOo ooIlIoo1oiOo = this.I0000O;
/* 15 */                Il11i1 il11i1 = this.I0001Ioi1lo;
/* 17 */                OoOilO ooOilO = this.I0000oI00;
/* 21 */                O011oOIoO00O o011oOIoO00O = (O011oOIoO00O) ooIlIoo1oiOo.I00ilO0;
/* 23 */                o011oOIoO00O.getClass();
/* 26 */                ConcurrentHashMap concurrentHashMap = o011oOIoO00O.I00iiI;
/* 31 */                if (il11i1 == O011oOIoO00O.I00iiO) {
/* 99 */                    il11i1 = o011oOIoO00O;
/* 104 */                   it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 108 */                   boolean z = false;
                            while (true) {
/* 113 */                       if (it.hasNext()) {
/* 119 */                           OoO00iO0OOl0 ooO00iO0OOl0 = (OoO00iO0OOl0) it.next();
/* 121 */                           if (z) {
/* 127 */                               OoO00O1IiOl ooO00O1IiOlI00000oIO = ooO00iO0OOl0.I00000oIO(ooIlIoo1oiOo, ooOilO);
/* 131 */                               if (ooO00O1IiOlI00000oIO != null) {
/* 133 */                                   ooO00O1IiOlI0000O = ooO00O1IiOlI00000oIO;
                                            break;
                                        }
                                    } else if (ooO00iO0OOl0 == il11i1) {
/* 125 */                               z = true;
                                    }
                                } else {
/* 135 */                           if (z) {
/* 146 */                               IioIoO10iOiI.I000OiO("GSON cannot serialize or deserialize ", ooOilO);
/* 149 */                               return;
                                    }
/* 137 */                           ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(ooOilO);
                                }
                            }
/* 141 */                   this.I00000oIO = ooO00O1IiOlI0000O;
                        } else {
/* 34 */                    Class cls = ooOilO.I00000oIO;
/* 40 */                    OoO00iO0OOl0 ooO00iO0OOl02 = (OoO00iO0OOl0) concurrentHashMap.get(cls);
/* 42 */                    if (ooO00iO0OOl02 != null) {
/* 44 */                        if (ooO00iO0OOl02 == il11i1) {
                                }
/* 104 */                       it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 108 */                       boolean z2 = false;
                                while (true) {
/* 113 */                           if (it.hasNext()) {
                                    }
                                }
/* 141 */                       this.I00000oIO = ooO00O1IiOlI0000O;
                            } else {
/* 53 */                        O011liOil o011liOil = (O011liOil) cls.getAnnotation(O011liOil.class);
/* 55 */                        if (o011liOil != null) {
/* 58 */                            Class clsValue = o011liOil.value();
/* 68 */                            if (OoO00iO0OOl0.class.isAssignableFrom(clsValue)) {
/* 86 */                                OoO00iO0OOl0 ooO00iO0OOl03 = (OoO00iO0OOl0) o011oOIoO00O.I00iOIl.I00o0l1o1o0(new OoOilO(clsValue), true).I00000oOI();
/* 92 */                                OoO00iO0OOl0 ooO00iO0OOl04 = (OoO00iO0OOl0) concurrentHashMap.putIfAbsent(cls, ooO00iO0OOl03);
/* 94 */                                if (ooO00iO0OOl04 != null) {
/* 96 */                                    ooO00iO0OOl03 = ooO00iO0OOl04;
                                        }
/* 97 */                                if (ooO00iO0OOl03 == il11i1) {
                                        }
                                    }
                                }
/* 104 */                       it = ((List) ooIlIoo1oiOo.I00io1l).iterator();
/* 108 */                       boolean z22 = false;
                                while (true) {
/* 113 */                           if (it.hasNext()) {
                                    }
                                }
/* 141 */                       this.I00000oIO = ooO00O1IiOlI0000O;
                            }
                        }
                    }
/* 150 */           ooO00O1IiOlI0000O.I0000Il00O(o01ooi1IIiiO, obj);
                }
            }
