            package p000;

            import java.lang.annotation.Annotation;
            import java.util.ArrayList;
            
            public abstract class lIlIi0Ii1 {
                public static final OOo1O1i I00000oIO(Annotation[] annotationArr, Ill0IO ill0IO) {
                    Annotation annotation;
/* 1 */             int length = annotationArr.length;
/* 2 */             int i = 0;
                    while (true) {
/* 4 */                 if (i >= length) {
/* 36 */                    annotation = null;
                            break;
                        }
/* 6 */                 annotation = annotationArr[i];
/* 30 */                if (O0000Ioio00.I0000O(OOo1Io0I0.I00000oIO(((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00()).I00000oIO(), ill0IO)) {
                            break;
                        }
/* 33 */                i++;
                    }
/* 37 */            if (annotation != null) {
/* 41 */                return new OOo1O1i(annotation);
                    }
/* 3 */             return null;
                }

                public static final ArrayList I00000oOI(Annotation[] annotationArr) {
/* 4 */             ArrayList arrayList = new ArrayList(annotationArr.length);
/* 9 */             for (Annotation annotation : annotationArr) {
/* 18 */                arrayList.add(new OOo1O1i(annotation));
                    }
/* 49 */            return arrayList;
                }
            }
