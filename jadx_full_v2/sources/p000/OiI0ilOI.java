            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OiI0ilOI implements Function1 {
                public float I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public float I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             float f = this.I00iOIl;
/* 3 */             float f2 = this.I00iiI;
/* 5 */             float f3 = this.I00iiO;
/* 7 */             float f4 = this.I00iio;
/* 43 */            List listI000O01llI0 = IOOi1I.I000O01llI0(Integer.valueOf(R.drawable.four_circle), Integer.valueOf(R.drawable.circle), Integer.valueOf(R.drawable.double_circle), Integer.valueOf(R.drawable.pantegon));
/* 47 */            int size = listI000O01llI0.size();
/* 55 */            I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(26);
/* 58 */            i0O11IOOo0OI.I00iiI = listI000O01llI0;
/* 60 */            VarHandle.storeStoreFence();
/* 65 */            OiI0ol0i oiI0ol0i = new OiI0ol0i();
/* 68 */            oiI0ol0i.I00iOIl = listI000O01llI0;
/* 70 */            oiI0ol0i.I00iiI = f;
/* 72 */            oiI0ol0i.I00iiO = f2;
/* 74 */            oiI0ol0i.I00iio = f3;
/* 76 */            oiI0ol0i.I00ilI0I1 = f4;
/* 78 */            VarHandle.storeStoreFence();
/* 87 */            IOii1l iOii1l = new IOii1l(-1942245546, oiI0ol0i, true);
/* 90 */            I00Ol00 i00Ol00 = ((O0l0I1) obj).I00000oOI;
/* 94 */            O0l011oOII o0l011oOII = new O0l011oOII();
/* 99 */            o0l011oOII.I00000oIO = O0l0I1.I0000Il00O;
/* 101 */           o0l011oOII.I00000oOI = i0O11IOOo0OI;
/* 103 */           o0l011oOII.I0000Il00O = iOii1l;
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           i00Ol00.I00000oIO(size, o0l011oOII);
/* 111 */           return OoiIlOl1iI.I00000oIO;
                }
            }
