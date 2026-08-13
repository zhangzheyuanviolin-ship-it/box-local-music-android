            package org.chromium.support_lib_boundary;

            import java.lang.reflect.InvocationHandler;
            import java.util.Map;
            
            public interface SpeculativeLoadingParametersBoundaryInterface {
                Map<String, String> getAdditionalHeaders();

                InvocationHandler getNoVarySearchData();

                default Integer getVariationsId() {
/* 1 */             return null;
                }

                boolean isJavaScriptEnabled();
            }
