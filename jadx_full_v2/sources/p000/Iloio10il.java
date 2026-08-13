            package p000;

            import android.content.Context;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class Iloio10il extends IlllollI implements IllOOo00lI {
                public final Ioi1Io1o I00ioIO;
                public final Context I00l0I0l0lO1;
                public final OI10i0Il I00l0OO0IO;
                public final OI10i0Il I00li1OI;
                public final OI10i0Il I00ll1;
                public final Ii0110 I00lli11;
                public final ImageDescriber I00lll10;
                public final OI10i0Il I00o0iI0io1;
                public final Ol1OlloIO I00o0l1o1o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iloio10il(Ioi1Io1o ioi1Io1o, Context context, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, Ii0110 ii0110, ImageDescriber imageDescriber, OI10i0Il oI10i0Il4, Ol1OlloIO ol1OlloIO) {
/* 27 */            super(0, Iooooooil.class, "captureAndDescribe", "NanoImageDescribeContent$captureAndDescribe(Landroidx/camera/core/ImageCapture;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lcom/google/mlkit/genai/imagedescription/ImageDescriber;Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/SnackbarHostState;)V", 0);
/* 1 */             this.I00ioIO = ioi1Io1o;
/* 3 */             this.I00l0I0l0lO1 = context;
/* 5 */             this.I00l0OO0IO = oI10i0Il;
/* 7 */             this.I00li1OI = oI10i0Il2;
/* 9 */             this.I00ll1 = oI10i0Il3;
/* 11 */            this.I00lli11 = ii0110;
/* 13 */            this.I00lll10 = imageDescriber;
/* 15 */            this.I00o0iI0io1 = oI10i0Il4;
/* 17 */            this.I00o0l1o1o0 = ol1OlloIO;
                }

                @Override
                public final Object invoke() {
/* 1 */             Boolean bool = Boolean.TRUE;
/* 3 */             OI10i0Il oI10i0Il = this.I00l0OO0IO;
/* 5 */             oI10i0Il.setValue(bool);
/* 10 */            OI10i0Il oI10i0Il2 = this.I00li1OI;
/* 12 */            oI10i0Il2.setValue("");
/* 17 */            Executor mainExecutor = this.I00l0I0l0lO1.getMainExecutor();
/* 23 */            IloioIIloi iloioIIloi = new IloioIIloi();
/* 28 */            iloioIIloi.I00000oIO = this.I00ll1;
/* 32 */            iloioIIloi.I00000oOI = this.I00lli11;
/* 34 */            iloioIIloi.I0000Il00O = oI10i0Il;
/* 36 */            iloioIIloi.I0000O = oI10i0Il2;
/* 40 */            iloioIIloi.I0000oI00 = this.I00lll10;
/* 44 */            iloioIIloi.I0001Ioi1lo = this.I00o0iI0io1;
/* 48 */            iloioIIloi.I000II = this.I00o0l1o1o0;
/* 50 */            VarHandle.storeStoreFence();
/* 55 */            this.I00ioIO.I00IlilI0i0i(mainExecutor, iloioIIloi);
/* 58 */            return OoiIlOl1iI.I00000oIO;
                }
            }
