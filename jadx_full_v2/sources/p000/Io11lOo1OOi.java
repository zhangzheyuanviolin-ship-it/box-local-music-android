            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            
            public abstract class Io11lOo1OOi {
                public static final int I00000oIO = 0;
                private static volatile Choreographer choreographer;

                static {
                    Object objI00000oIO;
                    try {
/* 11 */                objI00000oIO = new Io11l1li(I00000oIO(Looper.getMainLooper()));
                    } catch (Throwable th) {
/* 16 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 22 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 24 */                objI00000oIO = null;
                    }
                }

                public static final Handler I00000oIO(Looper looper) {
/* 24 */            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                }

                public static final Object I00000oOI(IIIIOoOIIOI iIIIOoOIIOI) {
/* 1 */             Choreographer choreographer2 = choreographer;
/* 3 */             int i = 1;
/* 4 */             if (choreographer2 != null) {
/* 12 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iIIIOoOIIOI));
/* 15 */                iIoOoIol0Io0.I00111O();
/* 20 */                I1100io i1100io = new I1100io(i);
/* 23 */                i1100io.I00iiI = iIoOoIol0Io0;
/* 25 */                VarHandle.storeStoreFence();
/* 28 */                choreographer2.postFrameCallback(i1100io);
/* 31 */                Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 35 */                Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */                return objI0010I0i;
                    }
/* 44 */            IIoOoIol0Io0 iIoOoIol0Io02 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iIIIOoOIIOI));
/* 47 */            iIoOoIol0Io02.I00111O();
/* 58 */            if (Looper.myLooper() == Looper.getMainLooper()) {
/* 60 */                I0000Il00O(iIoOoIol0Io02);
                    } else {
/* 64 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 66 */                Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 68 */                Ii00l101O ii00l101O = iIoOoIol0Io02.I00ilI0I1;
/* 73 */                I0lil01 i0lil01 = new I0lil01(7);
/* 76 */                i0lil01.I00iiI = iIoOoIol0Io02;
/* 78 */                VarHandle.storeStoreFence();
/* 81 */                io11l1li.I00iOIl(ii00l101O, i0lil01);
                    }
/* 84 */            Object objI0010I0i2 = iIoOoIol0Io02.I0010I0i();
/* 88 */            Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 168 */           return objI0010I0i2;
                }

                public static final void I0000Il00O(IIoOoIol0Io0 iIoOoIol0Io0) {
/* 1 */             Choreographer choreographer2 = choreographer;
/* 3 */             if (choreographer2 == null) {
/* 5 */                 choreographer2 = Choreographer.getInstance();
/* 9 */                 choreographer = choreographer2;
                    }
/* 14 */            I1100io i1100io = new I1100io(1);
/* 17 */            i1100io.I00iiI = iIoOoIol0Io0;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            choreographer2.postFrameCallback(i1100io);
                }
            }
