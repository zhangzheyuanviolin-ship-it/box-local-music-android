            package p000;

            import java.lang.annotation.Annotation;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class ilIIOO0loi1i {
                public static final Il0lloiOlO I00000oIO(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
/* 4 */             Il0lIiOiO1i il0lIiOiO1i = new Il0lIiOiO1i(str, enumArr.length);
/* 7 */             int length = enumArr.length;
/* 9 */             int i = 0;
/* 10 */            int i2 = 0;
/* 11 */            while (i < length) {
/* 13 */                Enum r5 = enumArr[i];
/* 15 */                int i3 = i2 + 1;
/* 21 */                String strName = (String) I1IoiO1l.I001iOo1i0O(i2, strArr);
/* 23 */                if (strName == null) {
/* 25 */                    strName = r5.name();
                        }
/* 29 */                il0lIiOiO1i.I000OiO(strName, false);
/* 36 */                Annotation[] annotationArr2 = (Annotation[]) I1IoiO1l.I001iOo1i0O(i2, annotationArr);
/* 38 */                if (annotationArr2 != null) {
/* 42 */                    for (Annotation annotation : annotationArr2) {
/* 46 */                        int i4 = il0lIiOiO1i.I0000O;
/* 48 */                        List[] listArr = il0lIiOiO1i.I0001Ioi1lo;
/* 50 */                        List arrayList = listArr[i4];
/* 52 */                        if (arrayList == null) {
/* 57 */                            arrayList = new ArrayList(1);
/* 62 */                            listArr[il0lIiOiO1i.I0000O] = arrayList;
                                }
/* 64 */                        arrayList.add(annotation);
                            }
                        }
/* 70 */                i++;
/* 72 */                i2 = i3;
                    }
/* 76 */            Il0lloiOlO il0lloiOlO = new Il0lloiOlO(str, enumArr);
/* 79 */            il0lloiOlO.I00000oOI = il0lIiOiO1i;
/* 483 */           return il0lloiOlO;
                }
            }
