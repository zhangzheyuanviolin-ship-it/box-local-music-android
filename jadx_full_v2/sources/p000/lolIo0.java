            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Executor;
            
/* 27 */    public final class lolIo0 implements IOiOiIIiii1, Ii00l0i1loO, OO1I1O0ooilo, IOIoiiol, OoI0o0oiol0l, Ii100OlIo10, OIOlOI, iiIi1oo0Io, lIoio0O1ioo {
                public static lolIo0 I00iiI;
                public static OOllOII I00iio;
                public final int I00iOIl;
                public static final lolIo0 I00iiO = new lolIo0(1);
                public static final lolIo0 I00ilI0I1 = new lolIo0(2);
                public static final lolIo0 I00ilO0 = new lolIo0(3);
                public static final lolIo0 I00io1l = new lolIo0(4);
                public static final lolIo0 I00ioIO = new lolIo0(5);
                public static final OoOil11Ol1o I00l0I0l0lO1 = new OoOil11Ol1o();
                public static final lolIo0 I00l0OO0IO = new lolIo0(7);
                public static final lolIo0 I00li1OI = new lolIo0(19);
                public static final lolIo0 I00ll1 = new lolIo0(20);
                public static final lolIo0 I00lli11 = new lolIo0(21);
                public static final lolIo0 I00lll10 = new lolIo0(22);
                public static final lolIo0 I00o0iI0io1 = new lolIo0(23);
                public static final lolIo0 I00o0l1o1o0 = new lolIo0(24);
                public static final lolIo0 I00o101lO = new lolIo0(25);

                public lolIo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static synchronized void I00000oIO() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new lolIo0(0);
                    }
                }

                @Override
                public Iterable I0001Ioi1lo(Object obj) {
                    Collection collectionI000o00OoI0I;
/* 1 */             IIiO00o1o iIiO00o1o = (IIiO00o1o) obj;
                    return (iIiO00o1o == null || (collectionI000o00OoI0I = iIiO00o1o.I000o00OoI0I()) == null) ? Il01100l.I00iOIl : collectionI000o00OoI0I;
                }

                @Override
                public boolean I000OOo1O(OI000ilOol oI000ilOol, IiOoI01 iiOoI01) {
/* 11 */            return !iiOoI01.getAnnotations().I001l0I00(OO1II0lllOI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 14 */            ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000OiO, new IiIIl0OOio0O((IlliIl1l11O) oll0io, (IOoil1iiIilo) null, 4));
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
                    switch (this.I00iOIl) {
                        case 2:
/* 40 */                    return ilIl1O1ii0Oo.I00000oIO((Executor) ((I1ii1o0) iOiOIoiiO0i).I000iOII(new OOiilOlOOI(Ooi1oi1il0i.class, Executor.class)));
                        default:
/* 19 */                    return new O1oO0lOoI1(0);
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 191 */                   return new Boolean(((Boolean) iII10IIoliO.I00000oIO.get()).booleanValue());
                        case PoseLandmark.RIGHT_INDEX:
/* 136 */                   List list = iol1II1ii1i.I00000oIO;
/* 140 */                   iI1lO0li.I00iiI.get();
/* 164 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
                        case PoseLandmark.LEFT_THUMB:
/* 110 */                   List list2 = iol1II1ii1i.I00000oIO;
/* 114 */                   iI1lO0li.I00iiI.get();
/* 133 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(5, 86400000L, "measurement.config.cache_time").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 87 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 91 */                    iIO0i1II.I00iiI.get();
/* 107 */                   return (Boolean) iIO0o100IO.I00000oIO.I0010o(false, "measurement.test.boolean_flag", 0).get();
                        case PoseLandmark.LEFT_HIP:
/* 61 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 65 */                    iI1lO0li.I00iiI.get();
/* 84 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
                        case PoseLandmark.RIGHT_HIP:
/* 42 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 58 */                    return (Boolean) iIi0lllIlIi.I00000oIO.get();
                        default:
/* 9 */                     List list6 = iol1II1ii1i.I00000oIO;
/* 13 */                    iI1lO0li.I00iiI.get();
/* 37 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
                    }
                }

                @Override
                public lO1i1o0O0o mo39zzb(Class cls) {
/* 29 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
                public boolean zzc(Class cls) {
/* 1 */             return false;
                }

                @Override
/* 28 */        public int I000O01llI0(int i) {
/* 29 */            return i;
                }

                @Override
/* 28 */        public int I000o00OoI0I(int i) {
/* 29 */            return i;
                }
            }
