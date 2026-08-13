            package p000;

            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import java.lang.invoke.VarHandle;
            
            public final class IlI001 implements FaceDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final Object deleteAll(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             Iil0iiOiI iil0iiOiI = new Iil0iiOiI(5);
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iil0iiOiI);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object deleteById(long j, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(4);
/* 9 */             i0o0iioo0IO.I00iiI = j;
/* 11 */            VarHandle.storeStoreFence();
/* 16 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, i0o0iioo0IO);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object deleteByName(String str, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(13);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, i0ioO0Oio0ll);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object getAll(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             Iil0iiOiI iil0iiOiI = new Iil0iiOiI(6);
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, iil0iiOiI);
                }

                @Override
                public final Object insert(FaceRecord faceRecord, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(3);
/* 9 */             iiioilIl1Il.I00iiI = this;
/* 11 */            iiioilIl1Il.I00iiO = faceRecord;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iiioilIl1Il);
                }

                @Override
                public final Object rename(String str, String str2, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(4);
/* 9 */             iiioilIl1Il.I00iiI = str2;
/* 11 */            iiioilIl1Il.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iiioilIl1Il);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }
            }
