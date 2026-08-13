            package p000;

            import java.io.IOException;
            import java.time.LocalDateTime;
            import java.time.OffsetDateTime;
            import java.time.ZoneOffset;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class O00oI0iiI1 extends OoO00O1IiOl {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 3 */             LocalDateTime localDateTime = null;
/* 3 */             Collection collection = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 134 */                   o01loll1loll.I0000Il00O();
/* 137 */                   ZoneOffset zoneOffset = null;
/* 147 */                   while (o01loll1loll.peek() != 4) {
/* 149 */                       String strI00iOIl = o01loll1loll.I00iOIl();
/* 157 */                       if (strI00iOIl.equals("offset")) {
/* 188 */                           zoneOffset = (ZoneOffset) ((OoO00O1IiOl) this.I0000Il00O).I00000oOI(o01loll1loll);
                                } else if (strI00iOIl.equals("dateTime")) {
/* 177 */                           localDateTime = (LocalDateTime) ((OoIooiOoi0i) this.I00000oOI).I00000oOI(o01loll1loll);
                                } else {
/* 165 */                           o01loll1loll.I00oooO();
                                }
                            }
/* 191 */                   o01loll1loll.I00100l0();
/* 194 */                   O00o1ll1I.I00000oIO(localDateTime, "dateTime", o01loll1loll);
/* 197 */                   O00o1ll1I.I00000oIO(zoneOffset, "offset", o01loll1loll);
/* 200 */                   return OffsetDateTime.of(localDateTime, zoneOffset);
                        case 1:
/* 90 */                    if (o01loll1loll.peek() == 9) {
/* 92 */                        o01loll1loll.I00ioIO();
                            } else {
/* 105 */                       collection = (Collection) ((OIOi0l1il) this.I0000Il00O).I00000oOI();
/* 107 */                       o01loll1loll.I00000oIO();
/* 114 */                       while (o01loll1loll.I00IOO()) {
/* 126 */                           collection.add(((O00o1oIoiO) this.I00000oOI).I0000Il00O.I00000oOI(o01loll1loll));
                                }
/* 130 */                       o01loll1loll.I000l1();
                            }
/* 133 */                   return collection;
                        default:
/* 9 */                     Class cls = (Class) this.I00000oOI;
/* 17 */                    Object objI00000oOI = ((OoO11IIlIO01) this.I0000Il00O).I00iiO.I00000oOI(o01loll1loll);
/* 21 */                    if (objI00000oOI == null || cls.isInstance(objI00000oOI)) {
/* 83 */                        return objI00000oOI;
                            }
/* 82 */                    throw new O01Oo001("Expected a " + cls.getName() + " but was " + objI00000oOI.getClass().getName() + "; at path " + o01loll1loll.I001l0I00(true));
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 53 */                    OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
/* 55 */                    o01ooi1IIiiO.I000II();
/* 60 */                    o01ooi1IIiiO.I001i1lo1io("dateTime");
/* 71 */                    ((OoIooiOoi0i) this.I00000oOI).I0000Il00O(o01ooi1IIiiO, offsetDateTime.toLocalDateTime());
/* 76 */                    o01ooi1IIiiO.I001i1lo1io("offset");
/* 87 */                    ((OoO00O1IiOl) this.I0000Il00O).I0000Il00O(o01ooi1IIiiO, offsetDateTime.getOffset());
/* 90 */                    o01ooi1IIiiO.I00100l0();
                            break;
                        case 1:
/* 16 */                    Collection collection = (Collection) obj;
/* 18 */                    if (collection != null) {
/* 24 */                        o01ooi1IIiiO.I0000Il00O();
/* 27 */                        Iterator it = collection.iterator();
/* 35 */                        while (it.hasNext()) {
/* 45 */                            ((O00o1oIoiO) this.I00000oOI).I0000Il00O(o01ooi1IIiiO, it.next());
                                }
/* 49 */                        o01ooi1IIiiO.I000l1();
                                break;
                            } else {
/* 20 */                        o01ooi1IIiiO.I00IOO();
                                break;
                            }
                        default:
/* 12 */                    ((OoO11IIlIO01) this.I0000Il00O).I00iiO.I0000Il00O(o01ooi1IIiiO, obj);
                            break;
                    }
                }
            }
