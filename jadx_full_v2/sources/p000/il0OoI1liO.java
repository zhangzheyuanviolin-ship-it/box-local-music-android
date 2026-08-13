            package p000;
            
            public abstract class il0OoI1liO {
                public static void I00000oIO(Object obj, StringBuilder sb) {
                    int iLastIndexOf;
/* 1 */             if (obj == null) {
/* 5 */                 sb.append("null");
/* 8 */                 return;
                    }
/* 13 */            String simpleName = obj.getClass().getSimpleName();
/* 21 */            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
/* 41 */                simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
/* 45 */            sb.append(simpleName);
/* 50 */            sb.append('{');
/* 61 */            sb.append(Integer.toHexString(System.identityHashCode(obj)));
                }
            }
