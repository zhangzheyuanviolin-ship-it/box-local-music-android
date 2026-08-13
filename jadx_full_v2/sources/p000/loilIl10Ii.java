            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function3;
            
/* 157 */   public final class loilIl10Ii implements IO01oi0, IOiOiIIiii1, Ii00l0i1loO, OO1I1O0ooilo, IOIoiiol, OolOl0lI, OoI0o0oiol0l, IlIIIi, OIIlI1Oi, IOO0l0i0Oo, Il10iOl, illlllioii1, iiIi1oo0Io {
                public static loilIl10Ii I00iiI;
                public static final loilIl10Ii I00iiO = new loilIl10Ii(1);
                public static final loilIl10Ii I00iio = new loilIl10Ii(2);
                public static final loilIl10Ii I00ilI0I1 = new loilIl10Ii(3);
                public static final loilIl10Ii I00ilO0 = new loilIl10Ii(4);
                public static final loilIl10Ii I00io1l = new loilIl10Ii(5);
                public static final loilIl10Ii I00ioIO = new loilIl10Ii(6);
                public static final loilIl10Ii I00l0I0l0lO1 = new loilIl10Ii(7);
                public static final loilIl10Ii I00l0OO0IO = new loilIl10Ii(17);
                public static final loilIl10Ii I00li1OI = new loilIl10Ii(20);
                public static final loilIl10Ii I00ll1 = new loilIl10Ii(21);
                public static final loilIl10Ii I00lli11 = new loilIl10Ii(22);
                public static final loilIl10Ii I00lll10 = new loilIl10Ii(23);
                public static final loilIl10Ii I00o0iI0io1 = new loilIl10Ii(24);
                public static final loilIl10Ii I00o0l1o1o0 = new loilIl10Ii(25);
                public final int I00iOIl;

                public loilIl10Ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static IIo1lioOolol I000l1(OIlI1io oIlI1io) {
/* 3 */             List listSingletonList = Collections.singletonList(oIlI1io);
/* 7 */             IIo1lioOolol iIo1lioOolol = new IIo1lioOolol();
/* 10 */            iIo1lioOolol.I00000oIO = listSingletonList;
/* 16 */            OIlI1io oIlI1io2 = (OIlI1io) IOOi0Ool1i.I001lllioOl(listSingletonList);
/* 18 */            List list = listSingletonList;
/* 22 */            if ((list instanceof Collection) && list.isEmpty()) {
/* 33 */                VarHandle.storeStoreFence();
/* 36 */                return iIo1lioOolol;
                    }
/* 37 */            Iterator it = list.iterator();
/* 45 */            while (it.hasNext()) {
/* 57 */                if (((OIlI1io) it.next()).I00000oOI != oIlI1io2.I00000oOI) {
/* 62 */                    I000II.I001IO000("All outputs must have the same format!");
/* 65 */                    return null;
                        }
                    }
/* 67 */            VarHandle.storeStoreFence();
/* 77 */            return iIo1lioOolol;
                }

                public static synchronized void I000lI() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new loilIl10Ii(0);
                    }
                }

                @Override
                public boolean I00000oIO(O1ooOo o1ooOo) {
/* 1 */             return false;
                }

                @Override
                public int I00000oOI() {
/* 1 */             return 8;
                }

                @Override
                public boolean I0000Il00O(OillooOlI oillooOlI) {
/* 1 */             return false;
                }

                @Override
                public boolean I0000O(O1ooOo o1ooOo) {
/* 10 */            return iO0o00ili.I0001Ioi1lo(lO1OlOlOlli.I00000oIO(il0lI1i1olii.I000O01llI0(o1ooOo), false));
                }

                @Override
                public void I0000oI00(O0iiOioolIi o0iiOioolIi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z) {
/* 1 */             IIlOoolol0ll iIlOoolol0ll = o0iiOioolIi.I010101Oo1lO;
/* 5 */             OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) iIlOoolol0ll.I00ilI0I1;
/* 7 */             OI1lOo oI1lOo = OIIlIII0Ili.I0110o;
/* 24 */            ((OIIlIII0Ili) iIlOoolol0ll.I00ilI0I1).I011Ill(OIIlIII0Ili.I011Ol0, oIIlIII0Ili.I010o0o0oO(j, true), io1l0iI11iII, 1, z);
                }

                @Override
                public long I0001Ioi1lo() {
/* 1 */             return System.currentTimeMillis();
                }

                @Override
                public boolean I000II(Io1l0iI11iII io1l0iI11iII, O0iiOioolIi o0iiOioolIi) {
/* 1 */             return false;
                }

                @Override
                public boolean I000O01llI0(O0iiOioolIi o0iiOioolIi) {
/* 1 */             OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIi.I001i1lo1io();
/* 5 */             boolean z = false;
/* 7 */             if (oiioiIIloooI001i1lo1io != null && oiioiIIloooI001i1lo1io.I00iio) {
/* 13 */                z = true;
                    }
/* 14 */            return !z;
                }

                @Override
                public boolean I000OOo1O(OI000ilOol oI000ilOol, IiOoI01 iiOoI01) {
/* 1 */             return true;
                }

                @Override
                public boolean I000OiO() {
/* 1 */             return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 9 */             IoOIi0o ioOIi0o = (IoOIi0o) IoIo11O01ii.I00000oIO(ioIlI1oli, IoOIi0o.I00000oOI);
/* 19 */            ioOIi0o.I00000oIO.add(new I0i11IIo((Function3) oll0io, ioIlI1oli, (IOoil1iiIilo) null));
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 18 */            return ilIl1O1ii0Oo.I00000oIO((Executor) ((I1ii1o0) iOiOIoiiO0i).I000iOII(new OOiilOlOOI(II1011l1i1lo.class, Executor.class)));
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 123 */                   List list = iol1II1ii1i.I00000oIO;
/* 127 */                   iI1lO0li.I00iiI.get();
/* 153 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
                        case PoseLandmark.LEFT_THUMB:
/* 96 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 100 */                   iI1lO0li.I00iiI.get();
/* 120 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 70 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 74 */                    iI1lO0li.I00iiI.get();
/* 93 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(38, 1000L, "measurement.service_client.reconnect_millis").get();
                        case PoseLandmark.LEFT_HIP:
/* 44 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 48 */                    iI1lO0li.I00iiI.get();
/* 67 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
                        case PoseLandmark.RIGHT_HIP:
/* 25 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 41 */                    return (Boolean) iIIo0I10.I00000oIO.get();
                        default:
/* 6 */                     List list6 = iol1II1ii1i.I00000oIO;
/* 22 */                    return (Boolean) iIOOO1II.I00000oIO.get();
                    }
                }

                @Override
/* 158 */       public iOiIOO1ll zza() {
/* 159 */           return iOiIOO1ll.I0000Il00O(6, null, "AICore service disconnected");
                }
            }
