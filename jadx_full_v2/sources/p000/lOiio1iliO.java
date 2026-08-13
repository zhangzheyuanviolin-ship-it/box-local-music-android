            package p000;

            import java.util.ArrayList;
            
            public abstract class lOiio1iliO {
                public static String I00000oIO(int i) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if ((i & 4) != 0) {
/* 12 */                arrayList.add("IMAGE_CAPTURE");
                    }
/* 17 */            if ((i & 1) != 0) {
/* 21 */                arrayList.add("PREVIEW");
                    }
/* 26 */            if ((i & 2) != 0) {
/* 30 */                arrayList.add("VIDEO_CAPTURE");
                    }
/* 35 */            return String.join("|", arrayList);
                }
            }
