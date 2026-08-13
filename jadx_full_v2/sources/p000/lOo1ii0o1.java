            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class lOo1ii0o1 {
                public static final OoIOloiIii I00000oIO(O1ooOo o1ooOo, Object obj) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 5 */             if (!o1ooOo.I00iOIl.I00lll10) {
/* 9 */                 IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 14 */            O1ooOo o1ooOo2 = o1ooOo.I00iOIl.I00ilI0I1;
/* 16 */            O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(o1ooOo);
/* 21 */            while (o0iiOioolIiI000O01llI0 != null) {
/* 34 */                if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 262144) != 0) {
/* 36 */                    while (o1ooOo2 != null) {
/* 41 */                        if ((o1ooOo2.I00iiO & 262144) != 0) {
/* 43 */                            O1ooOo o1ooOoI0000Il00O = o1ooOo2;
/* 44 */                            OI110O0 oi110o0 = null;
/* 45 */                            while (o1ooOoI0000Il00O != null) {
/* 49 */                                if (o1ooOoI0000Il00O instanceof OoIOloiIii) {
/* 52 */                                    OoIOloiIii ooIOloiIii = (OoIOloiIii) o1ooOoI0000Il00O;
/* 62 */                                    if (obj.equals(ooIOloiIii.I000l1())) {
/* 64 */                                        return ooIOloiIii;
                                            }
                                        }
/* 68 */                                if ((o1ooOoI0000Il00O.I00iiO & 262144) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 79 */                                    int i = 0;
/* 81 */                                    for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 86 */                                        if ((o1ooOo3.I00iiO & 262144) != 0) {
/* 88 */                                            i++;
/* 90 */                                            if (i == 1) {
/* 92 */                                                o1ooOoI0000Il00O = o1ooOo3;
                                                    } else {
/* 94 */                                                if (oi110o0 == null) {
/* 102 */                                                   oi110o0 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 105 */                                               if (o1ooOoI0000Il00O != null) {
/* 107 */                                                   oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 110 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 111 */                                               oi110o0.I00000oOI(o1ooOo3);
                                                    }
                                                }
                                            }
/* 117 */                                   if (i == 1) {
                                            }
                                        }
/* 120 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                    }
                                }
/* 125 */                       o1ooOo2 = o1ooOo2.I00ilI0I1;
                            }
                        }
/* 128 */               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 143 */               o1ooOo2 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                    }
/* 20 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v13, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v18 */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v20 */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r1v8, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                public static final void I00000oOI(IiIill0O0li1 iiIill0O0li1, Object obj, Function1 function1) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 8 */             if (!((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 12 */                IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 20 */            O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1).I00iOIl.I00ilI0I1;
/* 22 */            O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iiIill0O0li1);
/* 26 */            while (o0iiOioolIiI000O01llI0 != null) {
/* 40 */                if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 262144) != 0) {
/* 42 */                    while (o1ooOo != null) {
/* 47 */                        if ((o1ooOo.I00iiO & 262144) != 0) {
/* 49 */                            IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo;
/* 50 */                            ?? oi110o0 = 0;
/* 51 */                            while (iiIioO0ol1oII0000Il00O != 0) {
/* 56 */                                if (iiIioO0ol1oII0000Il00O instanceof OoIOloiIii) {
/* 58 */                                    OoIOloiIii ooIOloiIii = (OoIOloiIii) iiIioO0ol1oII0000Il00O;
/* 80 */                                    if (!(obj.equals(ooIOloiIii.I000l1()) ? ((Boolean) function1.invoke(ooIOloiIii)).booleanValue() : true)) {
/* 408 */                                       return;
                                            }
                                        } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 262144) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 95 */                                    O1ooOo o1ooOo2 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 97 */                                    int i = 0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o0 = oi110o0;
/* 98 */                                    while (o1ooOo2 != null) {
/* 103 */                                       if ((o1ooOo2.I00iiO & 262144) != 0) {
/* 105 */                                           i++;
                                                    oi110o0 = oi110o0;
/* 107 */                                           if (i == 1) {
/* 109 */                                               iiIioO0ol1oII0000Il00O = o1ooOo2;
                                                    } else {
/* 111 */                                               if (oi110o0 == 0) {
/* 119 */                                                   oi110o0 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 122 */                                               if (iiIioO0ol1oII0000Il00O != 0) {
/* 124 */                                                   oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 127 */                                                   iiIioO0ol1oII0000Il00O = 0;
                                                        }
/* 128 */                                               oi110o0.I00000oOI(o1ooOo2);
                                                    }
                                                }
/* 131 */                                       o1ooOo2 = o1ooOo2.I00ilO0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o0 = oi110o0;
                                            }
/* 134 */                                   if (i == 1) {
                                            }
                                        }
/* 137 */                               iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                    }
                                }
/* 142 */                       o1ooOo = o1ooOo.I00ilI0I1;
                            }
                        }
/* 145 */               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 161 */               o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0, types: [IiIill0O0li1, OoIOloiIii, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v13, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v15 */
                /* JADX WARN: Type inference failed for: r2v16 */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v19 */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                public static final void I0000Il00O(OoIOloiIii ooIOloiIii, Function1 function1) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 2 */             O1ooOo o1ooOo = (O1ooOo) ooIOloiIii;
/* 8 */             if (!o1ooOo.I00iOIl.I00lll10) {
/* 12 */                IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 17 */            O1ooOo o1ooOo2 = o1ooOo.I00iOIl.I00ilI0I1;
/* 19 */            O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(ooIOloiIii);
/* 23 */            while (o0iiOioolIiI000O01llI0 != null) {
/* 37 */                if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 262144) != 0) {
/* 39 */                    while (o1ooOo2 != null) {
/* 44 */                        if ((o1ooOo2.I00iiO & 262144) != 0) {
/* 46 */                            IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo2;
/* 47 */                            ?? oi110o0 = 0;
/* 48 */                            while (iiIioO0ol1oII0000Il00O != 0) {
/* 52 */                                boolean zBooleanValue = true;
/* 53 */                                if (iiIioO0ol1oII0000Il00O instanceof OoIOloiIii) {
/* 55 */                                    OoIOloiIii ooIOloiIii2 = (OoIOloiIii) iiIioO0ol1oII0000Il00O;
/* 69 */                                    if (O0000Ioio00.I0000O(ooIOloiIii.I000l1(), ooIOloiIii2.I000l1()) && ooIOloiIii.getClass() == ooIOloiIii2.getClass()) {
/* 87 */                                        zBooleanValue = ((Boolean) function1.invoke(ooIOloiIii2)).booleanValue();
                                            }
/* 91 */                                    if (!zBooleanValue) {
/* 332 */                                       return;
                                            }
                                        } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 262144) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 106 */                                   O1ooOo o1ooOo3 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 108 */                                   int i = 0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o0 = oi110o0;
/* 109 */                                   while (o1ooOo3 != null) {
/* 114 */                                       if ((o1ooOo3.I00iiO & 262144) != 0) {
/* 116 */                                           i++;
                                                    oi110o0 = oi110o0;
/* 118 */                                           if (i == 1) {
/* 120 */                                               iiIioO0ol1oII0000Il00O = o1ooOo3;
                                                    } else {
/* 122 */                                               if (oi110o0 == 0) {
/* 130 */                                                   oi110o0 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 133 */                                               if (iiIioO0ol1oII0000Il00O != 0) {
/* 135 */                                                   oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 138 */                                                   iiIioO0ol1oII0000Il00O = 0;
                                                        }
/* 139 */                                               oi110o0.I00000oOI(o1ooOo3);
                                                    }
                                                }
/* 142 */                                       o1ooOo3 = o1ooOo3.I00ilO0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o0 = oi110o0;
                                            }
/* 145 */                                   if (i == 1) {
                                            }
                                        }
/* 148 */                               iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                    }
                                }
/* 153 */                       o1ooOo2 = o1ooOo2.I00ilI0I1;
                            }
                        }
/* 156 */               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 172 */               o1ooOo2 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v15 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Type inference failed for: r5v8, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v11 */
                /* JADX WARN: Type inference failed for: r6v2 */
                /* JADX WARN: Type inference failed for: r6v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r6v4 */
                /* JADX WARN: Type inference failed for: r6v5 */
                /* JADX WARN: Type inference failed for: r6v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r6v8 */
                /* JADX WARN: Type inference failed for: r6v9 */
                public static final void I0000O(O1ooOo o1ooOo, String str, Function1 function1) {
/* 5 */             if (!o1ooOo.I00iOIl.I00lll10) {
/* 9 */                 IolioOO1.I0000Il00O("visitSubtreeIf called on an unattached node");
                    }
/* 18 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 21 */            O1ooOo o1ooOo2 = o1ooOo.I00iOIl;
/* 23 */            O1ooOo o1ooOo3 = o1ooOo2.I00ilO0;
/* 25 */            if (o1ooOo3 == null) {
/* 27 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo2);
                    } else {
/* 31 */                oi110o0.I00000oOI(o1ooOo3);
                    }
                    while (true) {
/* 34 */                int i = oi110o0.I00iiO;
/* 36 */                if (i == 0) {
/* 408 */                   return;
                        }
/* 44 */                O1ooOo o1ooOo4 = (O1ooOo) oi110o0.I000l1(i - 1);
/* 51 */                if ((o1ooOo4.I00iio & 262144) != 0) {
/* 54 */                    for (O1ooOo o1ooOo5 = o1ooOo4; o1ooOo5 != null && o1ooOo5.I00lll10; o1ooOo5 = o1ooOo5.I00ilO0) {
/* 63 */                        if ((o1ooOo5.I00iiO & 262144) != 0) {
/* 66 */                            IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo5;
/* 67 */                            ?? oi110o02 = 0;
/* 68 */                            while (iiIioO0ol1oII0000Il00O != 0) {
/* 72 */                                if (iiIioO0ol1oII0000Il00O instanceof OoIOloiIii) {
/* 74 */                                    OoIOloiIii ooIOloiIii = (OoIOloiIii) iiIioO0ol1oII0000Il00O;
/* 93 */                                    OoIOloOIOI1l ooIOloOIOI1l = str.equals(ooIOloiIii.I000l1()) ? (OoIOloOIOI1l) function1.invoke(ooIOloiIii) : OoIOloOIOI1l.I00iOIl;
/* 97 */                                    if (ooIOloOIOI1l == OoIOloOIOI1l.I00iiO) {
/* 408 */                                       return;
                                            }
/* 102 */                                   if (ooIOloOIOI1l == OoIOloOIOI1l.I00iiI) {
                                                break;
                                            }
                                        } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 262144) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 117 */                                   O1ooOo o1ooOo6 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 119 */                                   int i2 = 0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o02 = oi110o02;
/* 121 */                                   while (o1ooOo6 != null) {
/* 126 */                                       if ((o1ooOo6.I00iiO & 262144) != 0) {
/* 128 */                                           i2++;
                                                    oi110o02 = oi110o02;
/* 130 */                                           if (i2 == 1) {
/* 132 */                                               iiIioO0ol1oII0000Il00O = o1ooOo6;
                                                    } else {
/* 134 */                                               if (oi110o02 == 0) {
/* 140 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 143 */                                               if (iiIioO0ol1oII0000Il00O != 0) {
/* 145 */                                                   oi110o02.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 148 */                                                   iiIioO0ol1oII0000Il00O = 0;
                                                        }
/* 149 */                                               oi110o02.I00000oOI(o1ooOo6);
                                                    }
                                                }
/* 152 */                                       o1ooOo6 = o1ooOo6.I00ilO0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o02 = oi110o02;
                                            }
/* 155 */                                   if (i2 == 1) {
                                            }
                                        }
/* 158 */                               iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                }
                            }
                        }
/* 166 */               il0lI1i1olii.I00000oIO(oi110o0, o1ooOo4);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [OoIOloiIii, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v11 */
                /* JADX WARN: Type inference failed for: r6v12 */
                /* JADX WARN: Type inference failed for: r6v13 */
                /* JADX WARN: Type inference failed for: r6v14 */
                /* JADX WARN: Type inference failed for: r6v15 */
                /* JADX WARN: Type inference failed for: r6v7 */
                /* JADX WARN: Type inference failed for: r6v8, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v2 */
                /* JADX WARN: Type inference failed for: r7v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r7v4 */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v9 */
                public static final void I0000oI00(OoIOloiIii ooIOloiIii, Function1 function1) {
/* 8 */             if (!((O1ooOo) ooIOloiIii).I00iOIl.I00lll10) {
/* 12 */                IolioOO1.I0000Il00O("visitSubtreeIf called on an unattached node");
                    }
/* 21 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 27 */            O1ooOo o1ooOo = ((O1ooOo) ooIOloiIii).I00iOIl;
/* 29 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 31 */            if (o1ooOo2 == null) {
/* 33 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo);
                    } else {
/* 37 */                oi110o0.I00000oOI(o1ooOo2);
                    }
                    while (true) {
/* 40 */                int i = oi110o0.I00iiO;
/* 42 */                if (i == 0) {
/* 332 */                   return;
                        }
/* 50 */                O1ooOo o1ooOo3 = (O1ooOo) oi110o0.I000l1(i - 1);
/* 57 */                if ((o1ooOo3.I00iio & 262144) != 0) {
/* 60 */                    for (O1ooOo o1ooOo4 = o1ooOo3; o1ooOo4 != null && o1ooOo4.I00lll10; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 69 */                        if ((o1ooOo4.I00iiO & 262144) != 0) {
/* 72 */                            IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo4;
/* 73 */                            ?? oi110o02 = 0;
/* 74 */                            while (iiIioO0ol1oII0000Il00O != 0) {
/* 78 */                                if (iiIioO0ol1oII0000Il00O instanceof OoIOloiIii) {
/* 80 */                                    OoIOloiIii ooIOloiIii2 = (OoIOloiIii) iiIioO0ol1oII0000Il00O;
/* 113 */                                   OoIOloOIOI1l ooIOloOIOI1l = (O0000Ioio00.I0000O(ooIOloiIii.I000l1(), ooIOloiIii2.I000l1()) && ooIOloiIii.getClass() == ooIOloiIii2.getClass()) ? (OoIOloOIOI1l) function1.invoke(ooIOloiIii2) : OoIOloOIOI1l.I00iOIl;
/* 117 */                                   if (ooIOloOIOI1l == OoIOloOIOI1l.I00iiO) {
/* 332 */                                       return;
                                            }
/* 122 */                                   if (ooIOloOIOI1l == OoIOloOIOI1l.I00iiI) {
                                                break;
                                            }
                                        } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 262144) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 137 */                                   O1ooOo o1ooOo5 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 139 */                                   int i2 = 0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o02 = oi110o02;
/* 141 */                                   while (o1ooOo5 != null) {
/* 146 */                                       if ((o1ooOo5.I00iiO & 262144) != 0) {
/* 148 */                                           i2++;
                                                    oi110o02 = oi110o02;
/* 150 */                                           if (i2 == 1) {
/* 152 */                                               iiIioO0ol1oII0000Il00O = o1ooOo5;
                                                    } else {
/* 154 */                                               if (oi110o02 == 0) {
/* 160 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 163 */                                               if (iiIioO0ol1oII0000Il00O != 0) {
/* 165 */                                                   oi110o02.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 168 */                                                   iiIioO0ol1oII0000Il00O = 0;
                                                        }
/* 169 */                                               oi110o02.I00000oOI(o1ooOo5);
                                                    }
                                                }
/* 172 */                                       o1ooOo5 = o1ooOo5.I00ilO0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o02 = oi110o02;
                                            }
/* 175 */                                   if (i2 == 1) {
                                            }
                                        }
/* 178 */                               iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                }
                            }
                        }
/* 186 */               il0lI1i1olii.I00000oIO(oi110o0, o1ooOo3);
                    }
                }
            }
