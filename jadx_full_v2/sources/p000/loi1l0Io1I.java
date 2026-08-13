            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public final class loi1l0Io1I implements I1Oll0OOO {
                public final int I00000oIO;
                public ll10Ii1io1I I00000oOI;
                public ArrayList I0000Il00O;
                public int I0000O;

                public loi1l0Io1I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 61 */                    ll10Ii1io1I ll10ii1io1i = this.I00000oOI;
/* 63 */                    int i = this.I0000O;
/* 65 */                    ArrayList arrayList = this.I0000Il00O;
/* 69 */                    ArrayList arrayList2 = new ArrayList(i);
/* 72 */                    for (int i2 = 0; i2 < i; i2++) {
/* 90 */                        if (((Boolean) IlloOoiiO.I00000oIO((Future) arrayList.get(i2))).booleanValue()) {
/* 99 */                            ((OOol0l1I1) ll10ii1io1i.I00000oOI).get(i2);
/* 102 */                           OIiilo1Ool0o.I00000oIO();
/* 105 */                           return null;
                                }
                            }
/* 107 */                   IoillO0OOoo ioillO0OOooI000o00OoI0I = IoillO0OOoo.I000o00OoI0I(arrayList2);
/* 113 */                   IIiOI01Io0 iIiOI01Io0 = new IIiOI01Io0();
/* 116 */                   VarHandle.storeStoreFence();
/* 122 */                   IOOoo0o0Io iOOoo0o0Io = new IOOoo0o0Io(ioillO0OOooI000o00OoI0I, true);
/* 130 */                   iOOoo0o0Io.I00lll10 = new IOOoiII1ioO(iOOoo0o0Io, iIiOI01Io0);
/* 132 */                   iOOoo0o0Io.I0010I0i();
/* 135 */                   return iOOoo0o0Io;
                        default:
/* 7 */                     ll10Ii1io1I ll10ii1io1i2 = this.I00000oOI;
/* 9 */                     ArrayList arrayList3 = this.I0000Il00O;
/* 11 */                    int i3 = this.I0000O;
/* 15 */                    IoillO0OOoo ioillO0OOooI000o00OoI0I2 = IoillO0OOoo.I000o00OoI0I(arrayList3);
/* 23 */                    o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(9);
/* 26 */                    o00io0iiooo0.I00iiO = ll10ii1io1i2;
/* 28 */                    o00io0iiooo0.I00iio = (i1ilO0II) obj;
/* 30 */                    o00io0iiooo0.I00iiI = i3;
/* 32 */                    o00io0iiooo0.I00ilI0I1 = arrayList3;
/* 34 */                    VarHandle.storeStoreFence();
/* 37 */                    i000IO i000ioI00000oIO = o0iOII1liI.I00000oIO(o00io0iiooo0);
/* 43 */                    Executor executor = (Executor) ll10ii1io1i2.I0000Il00O;
/* 47 */                    IOOoo0o0Io iOOoo0o0Io2 = new IOOoo0o0Io(ioillO0OOooI000o00OoI0I2, false);
/* 55 */                    iOOoo0o0Io2.I00lll10 = new IOOoiII1ioO(iOOoo0o0Io2, i000ioI00000oIO, executor);
/* 57 */                    iOOoo0o0Io2.I0010I0i();
/* 60 */                    return iOOoo0o0Io2;
                    }
                }
            }
