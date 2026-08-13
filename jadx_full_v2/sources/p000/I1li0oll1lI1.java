            package p000;

            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class I1li0oll1lI1 extends O010olO {
                public static final long I00ioIO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(I1li0oll1lI1.class.getDeclaredField("_disposer$volatile"));
                public final IIoOoIol0Io0 I00ilI0I1;
                public IiiOlIiio I00ilO0;
                public final I1liIOOo0i I00io1l;
                private volatile Object _disposer$volatile;

                public I1li0oll1lI1(I1liIOOo0i i1liIOOo0i, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 1 */             this.I00io1l = i1liIOOo0i;
/* 6 */             this.I00ilI0I1 = iIoOoIol0Io0;
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             return false;
                }

                @Override
                public final void I000oI1ioi(Throwable th) {
/* 2 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00ilI0I1;
/* 4 */             if (th != null) {
/* 12 */                I0OooiI1I i0OooiI1II00II0oii1o = iIoOoIol0Io0.I00II0oii1o(new IOiIII1I(false, th), null);
/* 16 */                if (i0OooiI1II00II0oii1o != null) {
/* 18 */                    iIoOoIol0Io0.I000oI1ioi(i0OooiI1II00II0oii1o);
/* 29 */                    I1liIO1Il1 i1liIO1Il1 = (I1liIO1Il1) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00ioIO);
/* 31 */                    if (i1liIO1Il1 != null) {
/* 33 */                        i1liIO1Il1.I00000oIO();
/* 36 */                        return;
                            }
/* 186 */                   return;
                        }
/* 186 */               return;
                    }
/* 37 */            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I1liIOOo0i.I00000oOI;
/* 39 */            I1liIOOo0i i1liIOOo0i = this.I00io1l;
/* 45 */            if (atomicIntegerFieldUpdater.decrementAndGet(i1liIOOo0i) == 0) {
/* 47 */                IiIOI1ol0o[] iiIOI1ol0oArr = i1liIOOo0i.I00000oIO;
/* 52 */                ArrayList arrayList = new ArrayList(iiIOI1ol0oArr.length);
/* 56 */                for (IiIOI1ol0o iiIOI1ol0o : iiIOI1ol0oArr) {
/* 64 */                    arrayList.add(iiIOI1ol0o.I000O01llI0());
                        }
/* 70 */                iIoOoIol0Io0.resumeWith(arrayList);
                    }
                }
            }
