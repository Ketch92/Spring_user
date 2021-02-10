package core.service;

public interface GenericMapper<R, T> {
    R mapToDto(T value);
    
    T mapFromDto(R value);
}
