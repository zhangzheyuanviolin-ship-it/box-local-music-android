            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import kotlin.jvm.functions.Function1;
            
/* 16 */    public final class IOI0llolI0 {
                public final OI1Iio0ii1 I00000oIO;
                public final OOoiliiIoloI I00000oOI;
                public final Collection I0000Il00O;
                public final Function1 I0000O;
                public final IOI01O1[] I0000oI00;

                public IOI0llolI0(OI1Iio0ii1 oI1Iio0ii1, IOI01O1[] ioi01o1Arr, Function1 function1) {
/* 14 */            this(oI1Iio0ii1, null, null, function1, (IOI01O1[]) Arrays.copyOf(ioi01o1Arr, ioi01o1Arr.length));
                }

/* 17 */        public IOI0llolI0(OI1Iio0ii1 oI1Iio0ii1, IOI01O1[] ioi01o1Arr) {
/* 18 */            this(oI1Iio0ii1, ioi01o1Arr, I0ollliOo0.I00o0l1o1o0);
                }

/* 18 */        public IOI0llolI0(OI1Iio0ii1 oI1Iio0ii1, OOoiliiIoloI oOoiliiIoloI, Collection collection, Function1 function1, IOI01O1... ioi01o1Arr) {
/* 20 */            this.I00000oIO = oI1Iio0ii1;
/* 21 */            this.I00000oOI = oOoiliiIoloI;
/* 22 */            this.I0000Il00O = collection;
/* 23 */            this.I0000O = function1;
/* 24 */            this.I0000oI00 = ioi01o1Arr;
                }

/* 24 */        public IOI0llolI0(Collection collection, IOI01O1[] ioi01o1Arr) {
/* 25 */            this(collection, ioi01o1Arr, I0ollliOo0.I00oI0i);
                }

/* 25 */        public IOI0llolI0(Collection collection, IOI01O1[] ioi01o1Arr, Function1 function1) {
/* 26 */            this(null, null, collection, function1, (IOI01O1[]) Arrays.copyOf(ioi01o1Arr, ioi01o1Arr.length));
                }
            }
