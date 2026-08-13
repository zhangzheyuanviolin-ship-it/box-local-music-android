            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class IOIooi0ol1i {
                public IoIlI1oli I00000oIO;
                public Object I00000oOI;
                public ArrayList I0000Il00O;

                public final void I00000oIO(IOIoiiol iOIoiiol, Oll0io oll0io) {
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 5 */             IoI0oI1ilOo1 ioI0oI1ilOo1 = new IoI0oI1ilOo1();
/* 8 */             ioI0oI1ilOo1.I00000oIO = iOIoiiol;
/* 10 */            ioI0oI1ilOo1.I00000oOI = oll0io;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            arrayList.add(ioI0oI1ilOo1);
                }
            }
