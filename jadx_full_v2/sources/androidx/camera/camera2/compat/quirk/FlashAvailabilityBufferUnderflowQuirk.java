            package androidx.camera.camera2.compat.quirk;

            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.I1IoiO1l;
            import p000.IlO1l1O11o;
            import p000.OOiio1i;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;", "LOOiio1i;", "<init>", "()V", "IlO1l1O11o", "camera-camera2"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class FlashAvailabilityBufferUnderflowQuirk implements OOiio1i {
                public static final Set I00000oIO;

                static {
/* 3 */             Locale locale = Locale.US;
/* 7 */             String lowerCase = "sprd".toLowerCase(locale);
/* 13 */            String lowerCase2 = "lemp".toLowerCase(locale);
/* 17 */            IlO1l1O11o ilO1l1O11o = new IlO1l1O11o();
/* 20 */            ilO1l1O11o.I00000oIO = lowerCase;
/* 22 */            ilO1l1O11o.I00000oOI = lowerCase2;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            String lowerCase3 = "sprd".toLowerCase(locale);
/* 35 */            String lowerCase4 = "DM20C".toLowerCase(locale);
/* 39 */            IlO1l1O11o ilO1l1O11o2 = new IlO1l1O11o();
/* 42 */            ilO1l1O11o2.I00000oIO = lowerCase3;
/* 44 */            ilO1l1O11o2.I00000oOI = lowerCase4;
/* 46 */            VarHandle.storeStoreFence();
/* 57 */            I00000oIO = I1IoiO1l.I00IlilI0i0i(new IlO1l1O11o[]{ilO1l1O11o, ilO1l1O11o2});
                }
            }
