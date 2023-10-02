package api

class Vec3(var x : Double = 0.0,
           var y : Double = 0.0,
           var z : Double = 0.0)
{
    fun add(vec3: Vec3) = Vec3(x + vec3.x, y + vec3.y, z + vec3.z)
    fun normalize(): Vec3 {
        val d0 = Math.sqrt(x * x + y * y + z * z)
        return Vec3(x / d0, y / d0, z / d0)
    }
    fun scale(scaleFactor : Double) = Vec3(x * scaleFactor, y * scaleFactor, z * scaleFactor)

}