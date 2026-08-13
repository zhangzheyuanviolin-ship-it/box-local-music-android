            package p000;

            import java.io.IOException;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.time.LocalDateTime;
            import java.time.ZoneId;
            import java.time.ZoneOffset;
            import java.time.ZonedDateTime;
            import java.util.Map;
            
/* 12 */    public final class O00o1oIoiO extends OoO00O1IiOl {
                public final int I00000oIO;
                public Object I00000oOI;
                public OoO00O1IiOl I0000Il00O;
                public Object I0000O;

                public O00o1oIoiO(OoIlIoo1oiOo ooIlIoo1oiOo, OoO00O1IiOl ooO00O1IiOl, Type type) {
/* 2 */             this.I00000oIO = 2;
/* 7 */             this.I00000oOI = ooIlIoo1oiOo;
/* 9 */             this.I0000Il00O = ooO00O1IiOl;
/* 11 */            this.I0000O = type;
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 4 */             LocalDateTime localDateTime = null;
/* 4 */             Map map = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 214 */                   o01loll1loll.I0000Il00O();
/* 217 */                   ZoneOffset zoneOffset = null;
/* 218 */                   ZoneId zoneId = null;
/* 230 */                   while (o01loll1loll.peek() != 4) {
                                switch (o01loll1loll.I00iOIl()) {
                                    case "offset":
/* 306 */                               zoneOffset = (ZoneOffset) this.I0000Il00O.I00000oOI(o01loll1loll);
                                        break;
                                    case "zone":
/* 297 */                               zoneId = (ZoneId) ((OoO00O1IiOl) this.I0000O).I00000oOI(o01loll1loll);
                                        break;
                                    case "dateTime":
/* 286 */                               localDateTime = (LocalDateTime) ((OoIooiOoi0i) this.I00000oOI).I00000oOI(o01loll1loll);
                                        break;
                                    default:
/* 274 */                               o01loll1loll.I00oooO();
                                        break;
                                }
                            }
/* 309 */                   o01loll1loll.I00100l0();
/* 312 */                   O00o1ll1I.I00000oIO(localDateTime, "dateTime", o01loll1loll);
/* 315 */                   O00o1ll1I.I00000oIO(zoneOffset, "offset", o01loll1loll);
/* 318 */                   O00o1ll1I.I00000oIO(zoneId, "zone", o01loll1loll);
/* 321 */                   return ZonedDateTime.ofInstant(localDateTime, zoneOffset, zoneId);
                        case 1:
/* 15 */                    int iPeek = o01loll1loll.peek();
/* 21 */                    if (iPeek == 9) {
/* 23 */                        o01loll1loll.I00ioIO();
                            } else {
/* 36 */                        map = (Map) ((OIOi0l1il) this.I0000O).I00000oOI();
/* 40 */                        if (iPeek == 1) {
/* 42 */                            o01loll1loll.I00000oIO();
/* 49 */                            while (o01loll1loll.I00IOO()) {
/* 51 */                                o01loll1loll.I00000oIO();
/* 60 */                                Object objI00000oOI = ((O00o1oIoiO) this.I00000oOI).I0000Il00O.I00000oOI(o01loll1loll);
/* 70 */                                Object objI00000oOI2 = ((O00o1oIoiO) this.I0000Il00O).I0000Il00O.I00000oOI(o01loll1loll);
/* 78 */                                if (map.containsKey(objI00000oOI)) {
/* 104 */                                   throw new O01Oo001("duplicate key: " + objI00000oOI);
                                        }
/* 80 */                                map.put(objI00000oOI, objI00000oOI2);
/* 83 */                                o01loll1loll.I000l1();
                                    }
/* 105 */                           o01loll1loll.I000l1();
                                } else {
/* 109 */                           o01loll1loll.I0000Il00O();
/* 116 */                           while (o01loll1loll.I00IOO()) {
/* 120 */                               looil0O1Io1.I00l0I0l0lO1.getClass();
/* 123 */                               int iI000O01llI0 = o01loll1loll.I00io1l;
/* 125 */                               if (iI000O01llI0 == 0) {
/* 127 */                                   iI000O01llI0 = o01loll1loll.I000O01llI0();
                                        }
/* 133 */                               if (iI000O01llI0 == 13) {
/* 135 */                                   o01loll1loll.I00io1l = 9;
                                        } else if (iI000O01llI0 == 12) {
/* 144 */                                   o01loll1loll.I00io1l = 8;
                                        } else {
/* 149 */                                   if (iI000O01llI0 != 14) {
/* 209 */                                       throw o01loll1loll.I0100o111I("a name");
                                            }
/* 153 */                                   o01loll1loll.I00io1l = 10;
                                        }
/* 161 */                               Object objI00000oOI3 = ((O00o1oIoiO) this.I00000oOI).I0000Il00O.I00000oOI(o01loll1loll);
/* 171 */                               Object objI00000oOI4 = ((O00o1oIoiO) this.I0000Il00O).I0000Il00O.I00000oOI(o01loll1loll);
/* 179 */                               if (map.containsKey(objI00000oOI3)) {
/* 202 */                                   throw new O01Oo001("duplicate key: " + objI00000oOI3);
                                        }
/* 181 */                               map.put(objI00000oOI3, objI00000oOI4);
                                    }
/* 210 */                           o01loll1loll.I00100l0();
                                }
                            }
/* 213 */                   return map;
                        default:
/* 10 */                    return this.I0000Il00O.I00000oOI(o01loll1loll);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    OoO00O1IiOl ooO00O1IiOlI0000O;
                    switch (this.I00000oIO) {
                        case 0:
/* 133 */                   ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
/* 135 */                   if (zonedDateTime == null) {
/* 137 */                       o01ooi1IIiiO.I00IOO();
                                break;
                            } else {
/* 141 */                       o01ooi1IIiiO.I000II();
/* 146 */                       o01ooi1IIiiO.I001i1lo1io("dateTime");
/* 157 */                       ((OoIooiOoi0i) this.I00000oOI).I0000Il00O(o01ooi1IIiiO, zonedDateTime.toLocalDateTime());
/* 162 */                       o01ooi1IIiiO.I001i1lo1io("offset");
/* 171 */                       this.I0000Il00O.I0000Il00O(o01ooi1IIiiO, zonedDateTime.getOffset());
/* 176 */                       o01ooi1IIiiO.I001i1lo1io("zone");
/* 187 */                       ((OoO00O1IiOl) this.I0000O).I0000Il00O(o01ooi1IIiiO, zonedDateTime.getZone());
/* 190 */                       o01ooi1IIiiO.I00100l0();
                                break;
                            }
                        case 1:
/* 75 */                    Map map = (Map) obj;
/* 79 */                    O00o1oIoiO o00o1oIoiO = (O00o1oIoiO) this.I0000Il00O;
/* 81 */                    if (map == null) {
/* 83 */                        o01ooi1IIiiO.I00IOO();
                                break;
                            } else {
/* 87 */                        o01ooi1IIiiO.I000II();
/* 102 */                       for (Map.Entry entry : map.entrySet()) {
/* 118 */                           o01ooi1IIiiO.I001i1lo1io(String.valueOf(entry.getKey()));
/* 125 */                           o00o1oIoiO.I0000Il00O(o01ooi1IIiiO, entry.getValue());
                                }
/* 129 */                       o01ooi1IIiiO.I00100l0();
                                break;
                            }
                        default:
/* 6 */                     OoO00O1IiOl ooO00O1IiOl = this.I0000Il00O;
/* 10 */                    ?? r1 = (Type) this.I0000O;
/* 27 */                    Class<?> cls = (obj == null || !((r1 instanceof Class) || (r1 instanceof TypeVariable))) ? r1 : obj.getClass();
/* 28 */                    if (cls != r1) {
/* 39 */                        OoO00O1IiOl ooO00O1IiOlI0000O2 = ((OoIlIoo1oiOo) this.I00000oOI).I0000O(new OoOilO(cls));
/* 45 */                        if (ooO00O1IiOlI0000O2 instanceof OOoiOooI) {
/* 48 */                            OoO00O1IiOl ooO00O1IiOl2 = ooO00O1IiOl;
/* 51 */                            while ((ooO00O1IiOl2 instanceof Oili10) && (ooO00O1IiOlI0000O = ((Oili10) ooO00O1IiOl2).I0000O()) != ooO00O1IiOl2) {
/* 63 */                                ooO00O1IiOl2 = ooO00O1IiOlI0000O;
                                    }
/* 67 */                            if (ooO00O1IiOl2 instanceof OOoiOooI) {
                                    }
                                } else {
/* 70 */                            ooO00O1IiOl = ooO00O1IiOlI0000O2;
                                }
                            }
/* 71 */                    ooO00O1IiOl.I0000Il00O(o01ooi1IIiiO, obj);
                            break;
                    }
                }
            }
